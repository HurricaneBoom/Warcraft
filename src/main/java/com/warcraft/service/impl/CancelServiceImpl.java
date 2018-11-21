package com.warcraft.service.impl;

import java.util.Map;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.warcraft.dao.CancelMapper;
import com.warcraft.service.CancelService;
@Service
public class CancelServiceImpl implements CancelService{
	@Autowired
	private CancelMapper cancelMapper;
	@Autowired
	private JmsTemplate jmsTemplate;
	@Resource(name="indent-canceled")
	private Destination destination;
	
	@Override
	public Integer cancelIndent(final Map<String, Object> map) {
		jmsTemplate.send(destination,new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				TextMessage message = session.createTextMessage("您的订单已被取消，订单号："+map.get("indent_id")+"");
				return message;
			}
		});
		Integer cancelIndent = cancelMapper.cancelIndent(map);
		return cancelIndent;
	}

}
