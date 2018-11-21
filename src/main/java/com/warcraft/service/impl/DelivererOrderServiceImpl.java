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

import com.warcraft.dao.DelivererOrderMapper;
import com.warcraft.pojo.DelivererOrder;
import com.warcraft.service.DelivererOrderService;

@Service
public class DelivererOrderServiceImpl implements  DelivererOrderService{
	
	@Autowired
	private DelivererOrderMapper delivererOrderMapper;
	
	@Autowired
	private JmsTemplate jmsTemplate;
	@Resource(name="indent-arrived")
	private Destination destination;

	@Override
	public List<DelivererOrder> selectAll() {
		List<DelivererOrder> list = delivererOrderMapper.selectAll();
		return list;
	}

	@Override
	public int udpateIndentStatus(final Long indentId) {
		jmsTemplate.send(destination,new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				TextMessage message = session.createTextMessage("您有一张订单外卖员已送达,订单号为："+indentId+"");
				return message;
			}
		});
		int updateEndtime = delivererOrderMapper.updateEndtime(indentId);
		int udpateIndentStatus = delivererOrderMapper.udpateIndentStatus(indentId);
		int result=updateEndtime+udpateIndentStatus;
		return result;
	}

	@Override
	public List<DelivererOrder> selectComplete() {
		List<DelivererOrder> selectComplete = delivererOrderMapper.selectComplete();
		return selectComplete;
	}

	

	
	
	

}
