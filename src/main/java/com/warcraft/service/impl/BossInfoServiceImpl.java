package com.warcraft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warcraft.dao.BossInfoMapper;
import com.warcraft.pojo.BossInfo;
import com.warcraft.service.BossInfoService;

@Service
public class BossInfoServiceImpl implements BossInfoService{

	@Autowired
	private BossInfoMapper bossInfoMapper;

	@Override
	public List<BossInfo> findObjects() {
		
		return null;
	}
	
	
	
}
