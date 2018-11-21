package com.warcraft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warcraft.dao.MenuInfoMapper;
import com.warcraft.pojo.MenuInfo;
import com.warcraft.service.MenuInfoService;

@Service
public class MenuInfoServiceImpl implements MenuInfoService{
	
	@Autowired
	private MenuInfoMapper menuInfoMapper;

	public List<MenuInfo> selectTrolley() {
		List<MenuInfo> list = menuInfoMapper.selectTrolley();
		return list;
	}
	@Override
	public List<MenuInfo> doQueryObjectsByName(String dietName) {
		List<MenuInfo> list = menuInfoMapper.doQueryObjectsByName(dietName);
		return list;
	}
	
	@Override
	public List<MenuInfo> fintObjects() {
		return menuInfoMapper.fintObjects();
	}
	
}
