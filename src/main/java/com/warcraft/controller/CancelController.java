package com.warcraft.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.service.CancelService;

@Controller
public class CancelController {
	@Autowired
	private CancelService cancelService;
	
	@RequestMapping("/cancelService")
	@ResponseBody
	public Integer cancelService(long indentId){
		HashMap<String, Object> hashMap = new HashMap<>();
		hashMap.put("indent_id", indentId);
		hashMap.put("abolish_reason", "something wrong");
		Integer cancelIndent = cancelService.cancelIndent(hashMap);
		return cancelIndent;
	}
}
