package com.warcraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.vo.JsonResult;
import com.warcraft.pojo.MenuInfo;
import com.warcraft.service.MenuInfoService;

@Controller
@RequestMapping("/menu")
public class MenuInfoController {
	@Autowired
	private MenuInfoService menuInfoService;
	
	@RequestMapping("doFindObjects")
	@ResponseBody
	public JsonResult doFindObjects(){
		return new JsonResult(menuInfoService.fintObjects());
	}
	
	@RequestMapping("selectTrolley")
	@ResponseBody
	public JsonResult selectTrolley(){			
		List<MenuInfo> list = menuInfoService.selectTrolley();
		return new JsonResult(list);
	}
	@RequestMapping("doQueryObjectsByName")
	@ResponseBody
	public JsonResult doQueryObjectsByName(String dietName){			
		List<MenuInfo> list = menuInfoService.doQueryObjectsByName(dietName);
		return new JsonResult(list);
	
	}
	
}
