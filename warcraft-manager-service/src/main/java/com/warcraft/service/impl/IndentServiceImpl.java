package com.warcraft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warcraft.mapper.IndentMapper;
import com.warcraft.pojo.Indent;
import com.warcraft.service.IndentService;
@Service
public class IndentServiceImpl implements IndentService{
	@Autowired
	private IndentMapper indentMapper;
	@Override
	public List<Indent> findAcceptedIndent() {
		List<Indent> list = indentMapper.findAcceptedIndent();
		return list;
	}
	
	//分配外卖员订单
	@Override
	public int updateIndentDelivering() {
		int insert = indentMapper.insertIndentDelivering();
		int update = indentMapper.updateIndentDelivering();
		int result=insert+update;
		return result;
	}

}
