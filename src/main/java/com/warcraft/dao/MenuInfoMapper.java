package com.warcraft.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.warcraft.pojo.MenuInfo;
import com.warcraft.pojo.MenuInfoExample;

public interface MenuInfoMapper {
	int countByExample(MenuInfoExample example);

	int deleteByExample(MenuInfoExample example);

	int deleteByPrimaryKey(Long dietId);

	int insert(MenuInfo record);

	int insertSelective(MenuInfo record);

	List<MenuInfo> selectByExample(MenuInfoExample example);

	MenuInfo selectByPrimaryKey(Long dietId);

	int updateByExampleSelective(@Param("record") MenuInfo record, @Param("example") MenuInfoExample example);

	int updateByExample(@Param("record") MenuInfo record, @Param("example") MenuInfoExample example);

	int updateByPrimaryKeySelective(MenuInfo record);

	int updateByPrimaryKey(MenuInfo record);

	List<MenuInfo> fintObjects();

	List<MenuInfo> selectTrolley();

	List<MenuInfo> doQueryObjectsByName(String dietName);
}