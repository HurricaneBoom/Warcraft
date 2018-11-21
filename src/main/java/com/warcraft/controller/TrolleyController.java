package com.warcraft.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.vo.JsonResult;
import com.warcraft.pojo.BuyerInfo;
import com.warcraft.pojo.Trolley;
import com.warcraft.service.BuyerInfoSerivce;
import com.warcraft.service.TrolleyService;

@Controller
@RequestMapping("/trolley")
public class TrolleyController {
	@Autowired
	private TrolleyService trolleyService;
	
	@RequestMapping("insertTrolley")
	@ResponseBody
	public JsonResult insertTrolley(Long dietId,Integer trolleyNum,BigDecimal trolleyMoney){
		Trolley trolley = new Trolley();
		trolley.setDietId(dietId);
		trolley.setTrolleyNum(trolleyNum);
		trolley.setTrolleyMoney(trolleyMoney);
		int result = trolleyService.insertTrolley(trolley);
		return new JsonResult("insert ok");
	}
	@RequestMapping("deleteTrolley")
	@ResponseBody
	public JsonResult deleteTrolley(Long dietId){
		int result = trolleyService.deleteTrolley(dietId);
		return new JsonResult("delete ok");
	}
}
