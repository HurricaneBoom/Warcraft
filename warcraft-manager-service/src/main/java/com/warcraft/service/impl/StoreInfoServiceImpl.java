package com.warcraft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warcraft.mapper.StoreInfoMapper;
import com.warcraft.pojo.StoreInfo;
import com.warcraft.service.StoreInfoService;

@Service
public class StoreInfoServiceImpl implements StoreInfoService{
	@Autowired
	private StoreInfoMapper storeInfoMapper;
	@Override
	public StoreInfo selectByPrimaryKey(long storeId) {
		StoreInfo storeInfo = storeInfoMapper.selectByPrimaryKey(storeId);
		return storeInfo;
	}

}
