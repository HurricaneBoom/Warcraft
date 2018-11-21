package com.warcraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.vo.JsonResult;
import com.warcraft.pojo.BuyerInfo;
import com.warcraft.service.BuyerInfoSerivce;

@Controller
@RequestMapping("/buyer")
public class BuyerInfoController {
	@Autowired
	private BuyerInfoSerivce buyerInfoSerivce;
	
	@RequestMapping("selectByPrimaryKey")
	@ResponseBody
	public BuyerInfo selectByPrimaryKey(){
		BuyerInfo buyerInfo = buyerInfoSerivce.selectByPrimaryKey(1L);
		return buyerInfo;
	}

	@RequestMapping("findBuyerByUsername")
	@ResponseBody
	public JsonResult findBuyerByUsername(String username, String password){
		List<BuyerInfo> buyerInfo = buyerInfoSerivce.findBuyerByUsername(username, password);
		//System.out.println(buyerInfo.size());
		return new JsonResult(buyerInfo);
	}
	
	
}
