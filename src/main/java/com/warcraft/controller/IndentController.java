package com.warcraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.vo.JsonResult;
import com.warcraft.dao.IndentMapper;
import com.warcraft.pojo.BossInfo;
import com.warcraft.pojo.Indent;
import com.warcraft.service.BossInfoSerivce;

@Controller
public class IndentController{
	@Autowired
	private IndentMapper indentMapper;
	
	@RequestMapping("selectIndent")
	@ResponseBody
	public JsonResult selectIndent(Long indentId){
		 List<Indent> idIndents=indentMapper.selectIndent(indentId);
		return new JsonResult(idIndents);
	}
	//取消中
	@RequestMapping("doCanceling")
	@ResponseBody
	public JsonResult doCanceling(Long indentId){
		List<Indent> idIndents=indentMapper.doCanceling(indentId);
		return new JsonResult(idIndents);
	}
	@RequestMapping("doCancelingall")
	public String doCancelingall(){
		return "dingdan_Canceling";
	}
	
	//所有
	@RequestMapping("doAllIndent")
	@ResponseBody
	public JsonResult doAllIndent(Long indentId){
		List<Indent> idIndents=indentMapper.doAllIndent(indentId);
		return new JsonResult(idIndents);
	}
	@RequestMapping("doAllIndentall")
	public String doAllIndentall(){
		return "dingdan_All";
	}
	//已接收
	@RequestMapping("doJieShou")
	@ResponseBody
	public JsonResult doJieShou(Long indentId){
		List<Indent> idIndents=indentMapper.doJieShou(indentId);
		return new JsonResult(idIndents);
	}
	@RequestMapping("doJieShouall")
	public String doJieShou(){
		return "dingdan_YiJie";
	}
	//更新payed

	@RequestMapping("updateIndentAccepted")
	@ResponseBody
	public JsonResult updateIndentAccepted(long indentId){
		int result = indentMapper.updateIndentAccepted(indentId);
		return new JsonResult(result);
	}
	//取消
	@RequestMapping("updateIndentCancele")
	@ResponseBody
	public JsonResult updateIndentCancel(long indentId){
		int result = indentMapper.updateIndentCancel(indentId);
		return new JsonResult(result);
	}
	
}
