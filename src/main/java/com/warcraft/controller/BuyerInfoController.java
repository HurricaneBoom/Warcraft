package com.warcraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.utils.JsonUtils;
import com.warcraft.common.vo.JsonResult;
import com.warcraft.common.vo.PageObject;
import com.warcraft.pojo.BuyerInfo;
import com.warcraft.service.BuyerInfoService;

@Controller
@RequestMapping("/buyerinfo")
public class BuyerInfoController {
	@Autowired
	private BuyerInfoService buyerInfoService;
	
	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll(){
		List<BuyerInfo> list = buyerInfoService.findAll();
		return JsonUtils.objectToJson(list);
	}
	
	@RequestMapping("doFindPageObjects")
	@ResponseBody
	public JsonResult doFindPageObjects(
			String buyerName,
			Integer pageCurrent){
		PageObject<BuyerInfo> data=
				buyerInfoService.findPageObjects(buyerName, pageCurrent);
		return new JsonResult(data);
	}
	//封冻买家
	@RequestMapping("doUpdateByBuyerId")
	@ResponseBody
	public JsonResult doUpdateByBuyerId(long buyerId){
		int update = buyerInfoService.updateByBuyerId(buyerId);
		return new JsonResult(update);
	}
	//恢复买家
	@RequestMapping("doResumeByBuyerId")
	@ResponseBody
	public JsonResult doResumeByBuyerId(long buyerId){
		int resume=buyerInfoService.resumeByBuyerId(buyerId);
		return new JsonResult(resume);
	}

}
