package com.warcraft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.vo.JsonResult;
import com.warcraft.pojo.Address;
import com.warcraft.service.AddressService;

@Controller
@RequestMapping("/address")
public class AddressController {
	@Autowired
	private AddressService addressService;
	
	@RequestMapping("doInsertAddressCon")
	@ResponseBody
	public JsonResult doInsertAddressCon(String addressCon) {
		int result = addressService.insertAddressCon(addressCon);
		return new JsonResult(result);
	}
	
	@RequestMapping("insert")
	@ResponseBody
	public JsonResult insert(String addressCon) {
		Address address = new Address();
		address.setBuyerId(1L);
		address.setAddressCon(addressCon);
		int result = addressService.insert(address);
		return new JsonResult(result);
	}
}
