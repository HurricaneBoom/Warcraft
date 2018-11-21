package com.warcraft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.vo.JsonResult;
import com.warcraft.pojo.DelivererInfo;
import com.warcraft.pojo.DelivererOrder;
import com.warcraft.service.DelivererInfoSerivce;
import com.warcraft.service.DelivererOrderService;

@Controller
@RequestMapping("/")
public class deliverInformationController {
	@Autowired
	public DelivererInfoSerivce delivererInfoSerivce;
	
	@RequestMapping("doLoginUI")
	public String  doLoginUI(){
		return "login";
	}
	
	@RequestMapping("doIndexUI")
	public String doIndexUI(){	
		return "delieverInformation";
	}

	
	@RequestMapping("selectByPrimaryKey1")
	@ResponseBody
	public JsonResult selectByPrimaryKey1(){
		DelivererInfo delivererInfo = 
				delivererInfoSerivce.selectByPrimaryKey(1L);
		return new JsonResult(delivererInfo);
	}
	
	
	@RequestMapping("doFindObject")
	@ResponseBody
	public JsonResult doFindObject(String username,String password){
				DelivererInfo findObject = delivererInfoSerivce.findObject(username, password);
		return new JsonResult(findObject);
	}
	
	
	@RequestMapping("doUpdateStateById")
	@ResponseBody
	public JsonResult doUpdateStateById(Integer delivererId){
				int updateById = delivererInfoSerivce.updateById(delivererId);
		return new JsonResult(updateById);
	}
	
	@RequestMapping("doUpdateStateById1")
	@ResponseBody
	public JsonResult doUpdateStateById1(Integer delivererId){
				int updateById1 = delivererInfoSerivce.updateStateById1(delivererId);
		return new JsonResult(updateById1);
	}
	
}
