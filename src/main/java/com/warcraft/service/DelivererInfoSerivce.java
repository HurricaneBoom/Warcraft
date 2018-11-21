package com.warcraft.service;

import org.apache.ibatis.annotations.Param;

import com.warcraft.pojo.BuyerInfo;
import com.warcraft.pojo.DelivererInfo;

public interface DelivererInfoSerivce {
	 DelivererInfo selectByPrimaryKey(Long delivererId);
	 int updateById(Integer id);
	 int updateStateById1(Integer id);
	 DelivererInfo findObject(String username,String password);
	 
}
