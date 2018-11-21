package com.warcraft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.vo.JsonResult;
import com.warcraft.service.IndentService;

@Controller
@RequestMapping("/indent")
public class IndentController {
	@Autowired
	private IndentService indentService;
	
	@RequestMapping("doFindIndentObject")
	@ResponseBody
	public JsonResult doFindIndentObject(){
		return new JsonResult(indentService.findIndentObject());
	}
	
	@RequestMapping("doDeleteById")
	@ResponseBody
	public JsonResult doDeleteById(Integer indentId){
		int rows=indentService.deleteById(indentId);
		return new JsonResult("delete ok");
	}
	
	@RequestMapping("insertIndent")
	@ResponseBody
	public JsonResult insertIndent(){		
		int result = indentService.insertIndent();
		return new JsonResult("payment approval");
	}
}

