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

import com.warcraft.dao.IndentMapper;
import com.warcraft.pojo.Indent;
import com.warcraft.service.IndentService;

@Service
public class IndentServiceImpl implements IndentService{
  @Autowired
  private IndentMapper indentMapper;
  @Autowired
  private JmsTemplate jmsTemplate;
  @Resource(name="indent-accepted")
  private Destination destination;
  
  public List<Indent> selectIndent(Long indentId){
	  List<Indent> idIndents=indentMapper.selectIndent(indentId);
	  
	  return idIndents;
	  
  }
  public List<Indent> doAllIndent(Long indentId){
	  List<Indent> idIndents=indentMapper.doAllIndent(indentId);
	  
	  return idIndents;
	  
  }
  public List<Indent> doCanceling(Long indentId){
	  List<Indent> idIndents=indentMapper.doCanceling(indentId);
	  
	  return idIndents;
	  
  }
  public List<Indent> doJieShou(Long indentId){
	  List<Indent> idIndents=indentMapper.doJieShou(indentId);
	  
	  return idIndents;
	  
  }

@Override
public int updateIndentAccepted(final Long indentId) {
	jmsTemplate.send(destination,new MessageCreator() {
		
		@Override
		public Message createMessage(Session session) throws JMSException {
			TextMessage message = session.createTextMessage("您的订单已接单，订单号："+indentId+"");
			System.out.println(destination);
			return message;
		}
	});
	int result = indentMapper.updateIndentAccepted(indentId);
	return result;
}

@Override
public int updateIndentCancel(Long indentId) {
	int result = indentMapper.updateIndentCancel(indentId);
	return result;
}
  
}
