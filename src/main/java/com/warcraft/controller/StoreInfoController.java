package com.warcraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.vo.JsonResult;
import com.warcraft.pojo.BossInfo;
import com.warcraft.pojo.StoreInfo;
import com.warcraft.service.BossInfoService;
import com.warcraft.service.StoreInfoService;

@Controller
@RequestMapping("/store")
public class StoreInfoController {
	
	@Autowired
	private StoreInfoService storeInfoService;
	
	
	@RequestMapping("doFindObjects")
	@ResponseBody
	public JsonResult doFindObjects(){
		List<StoreInfo> data = storeInfoService.findObjects();
		//System.out.println(data);
		return new JsonResult(data);
	}
	
	@RequestMapping("doQueryObjectsByName")
	@ResponseBody
	public JsonResult doQueryObjectsByName(String storeName){
		List<StoreInfo> data = storeInfoService.doQueryObjectsByName(storeName);
		//System.out.println(data.toString());
		return new JsonResult(data);
	}
	
	
}
