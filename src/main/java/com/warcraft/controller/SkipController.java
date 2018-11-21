package com.warcraft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SkipController {
	@RequestMapping("doMenuBuyer")
	public String doMenuBuyer(){
		return "menu_buyer";
	}
	
	
	@RequestMapping("doIndexUI")
	public String doIndexUI(){
		return "index";
	}
	
	@RequestMapping("doIndent")
	public String doIndent(){
		return "indent";
	}
	
	@RequestMapping("doAddress")
	public String doAddress(){
		return "address";
	}
	
	@RequestMapping("doMenuList")
	public String doMenuList(){
		return "menu_list";
	}
}
