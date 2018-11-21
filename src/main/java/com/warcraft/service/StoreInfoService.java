package com.warcraft.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.warcraft.pojo.BossInfo;
import com.warcraft.pojo.StoreInfo;

public interface StoreInfoService {
	List<StoreInfo> doQueryObjectsByName(@Param("storeName") String storeName);
	
	List<StoreInfo> findObjects();
}
