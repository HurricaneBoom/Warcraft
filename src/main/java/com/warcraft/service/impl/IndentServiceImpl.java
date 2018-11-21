package com.warcraft.service.impl;

import java.util.List;

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

import com.warcraft.commonexception.ServiceException;
import com.warcraft.dao.IndentMapper;
import com.warcraft.pojo.Indent;
import com.warcraft.service.IndentService;

@Service
public class IndentServiceImpl implements IndentService{
	
	@Autowired
	private IndentMapper indentMapper;
	@Autowired
	private JmsTemplate jmsTemplate;
	@Resource(name="indent-payed")
	private Destination destination;
	
	public int insertIndent() {
		jmsTemplate.send(destination,new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				TextMessage message = session.createTextMessage("您有一个新订单请尽快处理哦");
				return message;
			}
		});
		int result = indentMapper.insertIndent();
		return result;
	}

	
	@Override
	public List<Indent> findIndentObject() {
		return indentMapper.findIndentObject();
	}

	@Override
	public int deleteById(Integer indentId) {
		//System.out.println(indentId);
		if(indentId==null||indentId<=0){
			throw new ServiceException("请先选择!");
		}
		int rows = indentMapper.deleteById(indentId);
		return rows;
	}

}
