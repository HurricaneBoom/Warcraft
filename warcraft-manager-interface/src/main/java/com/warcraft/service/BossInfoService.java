package com.warcraft.service;


import com.warcraft.common.vo.PageObject;
import com.warcraft.pojo.BossInfo;

public interface BossInfoService {
		//分页查询
		 PageObject<BossInfo> findPageObjects(
				   String username,
				   Integer pageCurrent);
		 
		 //封冻买家
		 int updateByStoreId(long storeId);
		 
		 int resumeByStoreId(long storeId);
}
