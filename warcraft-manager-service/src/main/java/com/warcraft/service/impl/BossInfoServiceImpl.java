package com.warcraft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warcraft.common.vo.PageObject;
import com.warcraft.mapper.BossInfoMapper;
import com.warcraft.pojo.BossInfo;
import com.warcraft.service.BossInfoService;

@Service
public class BossInfoServiceImpl implements BossInfoService{

	@Autowired
	private BossInfoMapper bossInfoMapper;
	@Override
	public PageObject<BossInfo> findPageObjects(String bossName, Integer pageCurrent) {
		//1.验证参数合法性(pageCurrent)
				if(pageCurrent==null||pageCurrent<1)
				throw new IllegalArgumentException("页码值无效");
				//2.按照条件查询总记录数并进行校验
				int rowCount=bossInfoMapper.getRowCount(bossName);
				if(rowCount==0)
				throw new IllegalArgumentException("没有对应记录");
				//3.按照条件查询当前页记录
				int pageSize=3;
				int startIndex=(pageCurrent-1)*pageSize;
				List<BossInfo> records=
				bossInfoMapper.findPageObjects(bossName,
						startIndex, pageSize);
				//4.封装查询结果并返回
				PageObject<BossInfo> pageObject=new PageObject<BossInfo>();
				pageObject.setRecords(records);
				pageObject.setRowCount(rowCount);
				pageObject.setPageCurrent(pageCurrent);
				pageObject.setPageSize(pageSize);
				//计算总页数:方法一
				/*int pageCount=rowCount/pageSize;
				  if(rowCount%pageSize!=0){
					pageCount++;
				  }*/
				//计算总页数:方法二
				int pageCount=(rowCount-1)/pageSize+1;
				pageObject.setPageCount(pageCount);
				return pageObject;
	}
	
	//封冻买家
	@Override
	public int updateByStoreId(long storeId) {
		int update = bossInfoMapper.updateByStoreId(storeId);
		return update;
	}
	//恢复买家
	@Override
	public int resumeByStoreId(long storeId) {
		int resume=bossInfoMapper.resumeByStoreId(storeId);
		return resume;
	}

}
