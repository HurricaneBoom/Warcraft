package com.warcraft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.pojo.ManagerInfo;
import com.warcraft.service.ManagerInfoService;

/**
 * 商品管理Controller
 * <p>Title: ItemController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Controller
public class ManagerInfoController {

	@Autowired
	private ManagerInfoService managerInfoService;
	
	@RequestMapping("/managerInfo/{managerId}")
	@ResponseBody
	public ManagerInfo getItemById(@PathVariable long managerId) {
		ManagerInfo managerInfo = managerInfoService.getInfoByID(managerId);
		return managerInfo;
	}
}
