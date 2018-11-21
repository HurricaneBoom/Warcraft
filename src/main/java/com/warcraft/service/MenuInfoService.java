package com.warcraft.service;

import java.util.List;

import com.warcraft.pojo.MenuInfo;

public interface MenuInfoService {
	List<MenuInfo> selectTrolley();

	List<MenuInfo> doQueryObjectsByName(String dietName);

	List<MenuInfo> fintObjects();
}
