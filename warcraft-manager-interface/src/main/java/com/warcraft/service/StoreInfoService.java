package com.warcraft.service;

import com.warcraft.pojo.StoreInfo;

public interface StoreInfoService {
	StoreInfo selectByPrimaryKey(long storeId);
}
