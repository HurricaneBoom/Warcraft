package com.warcraft.service;

import java.util.List;

import com.warcraft.pojo.BossInfo;



public interface BossInfoSerivce {
	List<BossInfo> findBossByBossId(Long bossId);
}
