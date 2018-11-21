package com.warcraft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.vo.JsonResult;
import com.warcraft.common.vo.PageObject;
import com.warcraft.pojo.DelivererInfo;
import com.warcraft.service.DelivererInfoService;

@Controller
@RequestMapping("/delivererinfo")
public class DelivererInfoController {
	@Autowired
	private DelivererInfoService delivererInfoService;
	
	@RequestMapping("doFindPageObjects")
	@ResponseBody
	public JsonResult doFindPageObjects(
			String delivererName,
			Integer pageCurrent){
		PageObject<DelivererInfo> data=
				delivererInfoService.findPageObjects(delivererName, pageCurrent);
		return new JsonResult(data);
	}
	//封冻买家
	@RequestMapping("doUpdateBydelivererId")
	@ResponseBody
	public JsonResult doUpdateBydelivererId(long delivererId){
		int update = delivererInfoService.updateByDelivererId(delivererId);
		return new JsonResult(update);
	}
	//恢复买家
	@RequestMapping("doResumeBydelivererId")
	@ResponseBody
	public JsonResult doResumeBydelivererId(long delivererId){
		int resume=delivererInfoService.resumeByDelivererId(delivererId);
		return new JsonResult(resume);
	}
}
