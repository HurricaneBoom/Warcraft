package com.warcraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.vo.JsonResult;
import com.warcraft.pojo.Indent;
import com.warcraft.service.IndentService;

@Controller
@RequestMapping("/indent/")
public class IndentController {
	@Autowired
	private IndentService indentService;
	
	@RequestMapping("doFindPageObjects")
	@ResponseBody
	public JsonResult findAcceptedIndent() {
		List<Indent> list = indentService.findAcceptedIndent();
		return new JsonResult(list);
	}
	
	@RequestMapping("doUpdateIndentDelivering")
	@ResponseBody
	public JsonResult updateIndentDelivering() {
		int result = indentService.updateIndentDelivering();
		return new JsonResult(result);
	}
}
