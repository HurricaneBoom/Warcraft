package com.warcraft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageObjectController {
	@RequestMapping("doIndexUI")
	public String  doIndexUI(){
		return "index";
	}
	@RequestMapping("dofindBossId")
	public String dofindBossId(){
		return "mendian";
	}
	@RequestMapping("dodingdan")
	public String dodingdan(){
		return "dingdan";
	}
	@RequestMapping("doLoginUI")
	public String doLoginUI(){
		return "login";
	}
}
