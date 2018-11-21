package com.warcraft.service;


import java.util.List;

import com.warcraft.pojo.MenuInfo;
public interface MenuInfoSerivce {
	List<MenuInfo> selectAllDiet();
	int insertDiet(MenuInfo info);
	MenuInfo findDietInfoById(int dietId);
	int updateDiet(MenuInfo info);
	 int doDeleteDiet(int dietId);
}
