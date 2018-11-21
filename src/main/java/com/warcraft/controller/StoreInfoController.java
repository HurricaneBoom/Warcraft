package com.warcraft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.vo.JsonResult;
import com.warcraft.pojo.StoreInfo;
import com.warcraft.service.StoreInfoService;


@RequestMapping("/storeinfo")
@Controller
public class StoreInfoController {
	@Autowired
	private StoreInfoService storeInfoService;
	
	
	@RequestMapping("/findStoreAll")
	@ResponseBody
	public JsonResult selectByPrimaryKey(long storeId){
		StoreInfo storeInfo = storeInfoService.selectByPrimaryKey(storeId);
		return new JsonResult(storeInfo);
	}
}
