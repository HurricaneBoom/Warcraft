package com.warcraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.vo.JsonResult;
import com.warcraft.common.vo.PageObject;
import com.warcraft.pojo.BossInfo;
import com.warcraft.service.BossInfoService;

@Controller
@RequestMapping("/bossinfo")
public class BossInfoController {
	@Autowired
	private BossInfoService bossInfoService;
	
	@RequestMapping("doFindPageObjects")
	@ResponseBody
	public JsonResult doFindPageObjects(
			String bossName,
			Integer pageCurrent){
		PageObject<BossInfo> data=
				bossInfoService.findPageObjects(bossName, pageCurrent);
		return new JsonResult(data);
	}
	//封冻买家
	@RequestMapping("doUpdateByStoreId")
	@ResponseBody
	public JsonResult doUpdateByStoreId(long storeId){
		int update = bossInfoService.updateByStoreId(storeId);
		return new JsonResult(update);
	}
	//恢复买家
	@RequestMapping("doResumeByStoreId")
	@ResponseBody
	public JsonResult doResumeByStoreId(long storeId){
		int resume=bossInfoService.resumeByStoreId(storeId);
		return new JsonResult(resume);
	}

}
