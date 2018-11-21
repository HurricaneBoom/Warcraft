package com.warcraft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warcraft.commonexception.ServiceException;
import com.warcraft.dao.TrolleyMapper;
import com.warcraft.pojo.Trolley;
import com.warcraft.service.TrolleyService;
@Service
public class TrolleyServiceImpl implements TrolleyService {
	@Autowired
	private TrolleyMapper trolleyMapper;

	@Override
	public int insertTrolley(Trolley trolley) {
		if(trolley.getDietId()==null||trolley.getDietId()<=0){
		throw new ServiceException("参数不合法");
		}
		int insert = trolleyMapper.insert(trolley);
		return insert;
	}

	@Override
	public int deleteTrolley(Long dietId) {
		int result = trolleyMapper.deleteTrolley(dietId);
		return result;
	}

	

	
}
