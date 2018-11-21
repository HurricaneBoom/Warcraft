package com.warcraft.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.warcraft.pojo.BuyerInfo;

public interface BuyerInfoSerivce {
	BuyerInfo selectByPrimaryKey(Long buyerId);
	
	List<BuyerInfo> findBuyerByUsername(@Param("username")String username,
			@Param("password")String password);
}
