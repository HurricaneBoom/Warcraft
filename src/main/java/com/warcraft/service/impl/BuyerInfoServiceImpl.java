package com.warcraft.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warcraft.commonexception.ServiceException;
import com.warcraft.dao.BuyerInfoMapper;
import com.warcraft.pojo.BuyerInfo;
import com.warcraft.service.BuyerInfoSerivce;
@Service
public class BuyerInfoServiceImpl implements BuyerInfoSerivce{
	@Autowired
	private BuyerInfoMapper buyerInfoMapper;
	
	public BuyerInfo selectByPrimaryKey(Long buyerId) {
		BuyerInfo buyerInfo = buyerInfoMapper.selectByPrimaryKey(buyerId);
		return buyerInfo;
	}

	@Override
	public List<BuyerInfo> findBuyerByUsername(String username, String password) {
		if(username==null||username.length()==0){
			throw new ServiceException("用户名不能空");
		}
		if(password==null||password.length()==0){
			throw new ServiceException("密码不能为空");
		}
		List<BuyerInfo> buyer = buyerInfoMapper.findBuyerByUsername(username, password);
		if(buyer==null||buyer.size()==0){
			throw new ServiceException("用户名或密码不正确");
		}
		return buyer;
	}

}
