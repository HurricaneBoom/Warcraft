package com.warcraft.dao;

import com.warcraft.pojo.MenuInfo;
import com.warcraft.pojo.MenuInfoExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

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
    /**查询所有菜品信息*/
    List<MenuInfo> selectAllDiet();
    /**添加菜品*/
    int insertDiet(MenuInfo info);
    /**根据菜品id查询菜品信息*/
    MenuInfo findDietInfoById(int dietId);
    int updateDiet(MenuInfo info);
    int doDeleteDiet(int dietId);
}