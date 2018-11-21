package com.warcraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.vo.JsonResult;
import com.warcraft.pojo.BossInfo;
import com.warcraft.service.BossInfoService;

@Controller
@RequestMapping("/boss")
public class BossInfoController {
	
	@Autowired
	private BossInfoService bossInfoService;
	
	@RequestMapping("doFindObjects")
	@ResponseBody
	public JsonResult doFindObjects(){
		List<BossInfo> data = bossInfoService.findObjects();
		return new JsonResult(data);
	}
}
