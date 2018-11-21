package com.warcraft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warcraft.dao.MenuInfoMapper;
import com.warcraft.pojo.MenuInfo;
import com.warcraft.service.MenuInfoSerivce;
@Service
public class MenuInfoServiceImpl implements MenuInfoSerivce {
	@Autowired
	private MenuInfoMapper menuInfoMapper;
	
	@Override
	public List<MenuInfo> selectAllDiet() {
		List<MenuInfo> info = menuInfoMapper.selectAllDiet();
		return info;
	}

	@Override
	public int insertDiet(MenuInfo info) {
		//1.合法性验证
		if (info==null) {
			throw new RuntimeException("保存对象不能为空");
		}
		if (info.getDietName()==null) {
			throw new RuntimeException("菜品名不能为空");
		}
		int rows = menuInfoMapper.insertDiet(info);
		return rows;
	}

	@Override
	public MenuInfo findDietInfoById(int dietId) {
		if (dietId==0||dietId<1) {
			throw new RuntimeException("id值无效");
		}
		MenuInfo info = menuInfoMapper.findDietInfoById(dietId);
		if (info==null) {
			throw new RuntimeException("该记录可能不存在");
		}
		return info;
	}

	@Override
	public int updateDiet(MenuInfo info) {
		int rows = menuInfoMapper.updateDiet(info);
		return rows;
	}

	@Override
	public int doDeleteDiet(int dietId) {
		if (dietId==0) {
			throw new RuntimeException("id值无效");
		}
		int rows = menuInfoMapper.doDeleteDiet(dietId);
		return rows;
	}

	
}
