package com.warcraft.sso.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.zookeeper.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.rpc.Result;
import com.warcraft.common.pojo.WarcraftResult;
import com.warcraft.common.utils.CookieUtils;
import com.warcraft.common.utils.JsonUtils;
import com.warcraft.pojo.ManagerInfo;
import com.warcraft.sso.service.ManagerInfoService;

@Controller
public class ManagerInfoController {
	@Autowired
	private ManagerInfoService managerInfoService;
	
	@RequestMapping("/managerInfo/register")
	@ResponseBody
	public WarcraftResult register(ManagerInfo managerInfo) {
		WarcraftResult result=managerInfoService.register(managerInfo);
		return result;
	}
	@RequestMapping("/managerInfo/login")
	@ResponseBody
	public WarcraftResult login(String managerUsername, String managerPassword,
			HttpServletResponse response,HttpServletRequest request) {
		WarcraftResult result=managerInfoService.login(managerUsername, managerPassword);
		//把token写入cookie
		CookieUtils.setCookie(request, response, "WC_TOKEN", result.getData().toString());
		return result;
	}
	@RequestMapping(value="/token/{token}",method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public String getUserByToken(@PathVariable String token,String callback){
		WarcraftResult result=managerInfoService.getMangerInfoByToken(token);
		//判断是否为jsonp请求
		if(StringUtils.isNotBlank(callback)){
			return callback+"("+JsonUtils.objectToJson(result)+");";
		}
		return JsonUtils.objectToJson(result);
	}
	
	@RequestMapping("/login")
	public String html(){
		return "login";
	}
	
	@RequestMapping("/starter")
	public String starter(){
		return "starter";
	}
	
}
