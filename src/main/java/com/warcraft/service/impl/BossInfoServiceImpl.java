package com.warcraft.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warcraft.dao.BossInfoMapper;
import com.warcraft.pojo.BossInfo;
import com.warcraft.service.BossInfoSerivce;


@Service
public class BossInfoServiceImpl implements BossInfoSerivce{
	@Autowired
	private BossInfoMapper bossInfoMapper;
	
	public List<BossInfo> findBossByBossId(Long bossId) {
		List<BossInfo> bossinfo = bossInfoMapper.findBossByBossId(bossId);
		return bossinfo;
	}

}
