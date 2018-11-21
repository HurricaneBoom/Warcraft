package com.warcraft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warcraft.commonexception.ServiceException;
import com.warcraft.dao.BossInfoMapper;
import com.warcraft.dao.StoreInfoMapper;
import com.warcraft.pojo.BossInfo;
import com.warcraft.pojo.StoreInfo;
import com.warcraft.service.BossInfoService;
import com.warcraft.service.StoreInfoService;

@Service
public class StoreInfoServiceImpl implements StoreInfoService{

	@Autowired
	private StoreInfoMapper storeInfoMapper;
	
	@Override
	public List<StoreInfo> findObjects() {
		return storeInfoMapper.findObjects();
	}

	@Override
	public List<StoreInfo> doQueryObjectsByName(String storeName) {
		if(storeName==null||storeName.length()==0){
			throw new IllegalArgumentException("请先输入店铺名");
		}
		List<StoreInfo> stores=storeInfoMapper.doQueryObjectsByName(storeName);
		if(stores==null){
			throw new ServiceException("店铺不存在");
		}
		return stores;
	}
	
}
