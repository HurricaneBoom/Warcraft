package com.warcraft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warcraft.dao.DelivererInfoMapper;
import com.warcraft.dao.DelivererOrderMapper;
import com.warcraft.pojo.DelivererInfo;
import com.warcraft.service.DelivererInfoSerivce;

@Service
public class DeliverInfoServiceImpl implements DelivererInfoSerivce {
	@Autowired
	private DelivererInfoMapper  delivererInfoMapper;

	@Override
	public DelivererInfo selectByPrimaryKey(Long delivererId) {
		 DelivererInfo DeliverInfo = delivererInfoMapper.selectByPrimaryKey(delivererId);
		return DeliverInfo;
	}

	@Override
	public DelivererInfo findObject(String username, String password) {
		DelivererInfo findObject = delivererInfoMapper.findObject(username, password);
		return findObject;
	}

	@Override
	public int updateById(Integer id) {
		int updateStateById = delivererInfoMapper.updateStateById(id);
		System.out.println(updateStateById);
		return updateStateById;
	}

	@Override
	public int updateStateById1(Integer id) {
		int updateStateById1 = delivererInfoMapper.updateStateById1(id);
		return updateStateById1;
	}

	


	
}
