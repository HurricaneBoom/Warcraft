package com.warcraft.service;

import com.warcraft.common.vo.PageObject;
import com.warcraft.pojo.DelivererInfo;

public interface DelivererInfoService {
	PageObject<DelivererInfo> findPageObjects(
			   String username,
			   Integer pageCurrent);
	 
	 //封冻买家
	 int updateByDelivererId(long delivererId);
	 
	 int resumeByDelivererId(long delivererId);
}
