package com.warcraft.service;

import java.util.List;


import com.warcraft.common.vo.PageObject;
import com.warcraft.pojo.BuyerInfo;

public interface BuyerInfoService {
	//分页查询
	List<BuyerInfo> findAll();
	
	 PageObject<BuyerInfo> findPageObjects(
			   String username,
			   Integer pageCurrent);
	 
	 //封冻买家
	 int updateByBuyerId(long buyerId);
	 
	 int resumeByBuyerId(long buyerId);
}
