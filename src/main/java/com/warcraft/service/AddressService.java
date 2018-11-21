package com.warcraft.service;

import org.apache.ibatis.annotations.Param;

import com.warcraft.pojo.Address;

public interface AddressService {
	int insertAddressCon(@Param("addressCon")String addressCon);
	
	int insert(Address record);
}
