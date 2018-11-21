package com.warcraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.support.logging.Log;
import com.warcraft.common.vo.JsonResult;
import com.warcraft.pojo.BuyerInfo;
import com.warcraft.pojo.DelivererOrder;
import com.warcraft.service.DelivererOrderService;

@Controller
@RequestMapping("/")
public class deliverOrderController {
	@Autowired
	private DelivererOrderService delivererOrderService ;
	
	@RequestMapping("doOrderUI")
	public String doOrderUI(){
		return "delieverOrder";
	}
	
	@RequestMapping("doOrderUI2")
	public String doOrderUI2(){
		return "delieverOrder2";
	}
	
	@RequestMapping("selectComplete")
	@ResponseBody
	public JsonResult selectComplete(){
		 List<DelivererOrder> selectComplete = delivererOrderService.selectComplete();
		return new JsonResult(selectComplete);
}
	
	
@RequestMapping("selectByPrimaryKey")
	@ResponseBody
	public JsonResult selectByPrimaryKey(){
		List<DelivererOrder> list = delivererOrderService.selectAll();
		return new JsonResult(list);
}

@RequestMapping("udpateIndentStatus")
@ResponseBody
public JsonResult udpateIndentStatus(Long indentId){
	int result = delivererOrderService.udpateIndentStatus(indentId);
	return new JsonResult(result);
}
}