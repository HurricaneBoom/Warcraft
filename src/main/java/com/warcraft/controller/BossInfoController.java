package com.warcraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.vo.JsonResult;
import com.warcraft.pojo.BossInfo;
import com.warcraft.service.BossInfoSerivce;

@Controller
public class BossInfoController{
	@Autowired
	private BossInfoSerivce bossInfoSerivce;
	
	@RequestMapping("findBossByBossId")
	@ResponseBody
	public JsonResult findBossByBossId(Long bossId){
		List<BossInfo> bossInfo = bossInfoSerivce.findBossByBossId(bossId);
		return new JsonResult(bossInfo);
	}

	
}
