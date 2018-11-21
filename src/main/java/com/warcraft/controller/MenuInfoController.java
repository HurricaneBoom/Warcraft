package com.warcraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.vo.JsonResult;
import com.warcraft.pojo.MenuInfo;
import com.warcraft.service.MenuInfoSerivce;
@RequestMapping("/")
@Controller
public class MenuInfoController {
	@Autowired
	private MenuInfoSerivce menuInfoSerivce;

	@RequestMapping("doDietList")
	public String doDietList(){
		return "diet_info";
	}
	@RequestMapping("doFindAllDiet")
	@ResponseBody
	public JsonResult doFindAllDiet(){
		List<MenuInfo> info=menuInfoSerivce.selectAllDiet();
		return new JsonResult(info);
	}
	@RequestMapping("doAllDiet")
	public String doAllDiet(){
		return "diet_list";
	}
	@RequestMapping("doAddDiet")
	public String doAddDiet(){
		return "diet_edit";
	}
	@RequestMapping("doInsertDiet")
	@ResponseBody
	public JsonResult doInsertDiet(MenuInfo info){
		int rows = menuInfoSerivce.insertDiet(info);
		return new JsonResult("save ok");
	}
	@RequestMapping("doUpdateDiet")
	public String doUpdateDiet(){
		return "diet_update";
	}
	@RequestMapping("doDietEditUI")
	public String doDietEditUI(){
		return "diet_updatelist";
	}
	@RequestMapping("doFindDietInfoById")
	@ResponseBody
	public JsonResult doFindDietInfoById(int dietId){
		MenuInfo info = menuInfoSerivce.findDietInfoById(dietId);
		return new JsonResult(info);
	}
	@RequestMapping("doDeleteDiet")
	public String doDeleteDiet(){
		return "diet_delete";
	}
	@RequestMapping("doUpdateDietOK")
	@ResponseBody
	public JsonResult doUpdateDietOK(MenuInfo info){
		System.out.println(info);
		menuInfoSerivce.updateDiet(info);
		return new JsonResult("update ok!");
	}
	@RequestMapping("doDeleteDietById")
	@ResponseBody
	public JsonResult doDeleteDietById(int dietId){
		menuInfoSerivce.doDeleteDiet(dietId);
		return new JsonResult("下架成功！");
	}
	@RequestMapping("doImages")
	public String doImages(){
		return "imgload";
	}

}
