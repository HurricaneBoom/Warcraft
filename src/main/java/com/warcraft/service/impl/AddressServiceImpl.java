package com.warcraft.service.impl;

import java.util.ServiceConfigurationError;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warcraft.commonexception.ServiceException;
import com.warcraft.dao.AddressMapper;
import com.warcraft.pojo.Address;
import com.warcraft.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressMapper addressMapper;
	
	@Override
	public int insertAddressCon(String addressCon) {
		if(addressCon==null||addressCon.length()==0){
			throw new ServiceException("请输入地址");
		}
		int rows = addressMapper.insertAddressCon(addressCon);
		return rows;
	}

	@Override
	public int insert(Address record) {
		int result = addressMapper.insert(record);
		return result;
	}

}
