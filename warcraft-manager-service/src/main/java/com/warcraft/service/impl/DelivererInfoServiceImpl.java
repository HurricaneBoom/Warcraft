package com.warcraft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warcraft.common.vo.PageObject;
import com.warcraft.mapper.DelivererInfoMapper;
import com.warcraft.pojo.DelivererInfo;
import com.warcraft.service.DelivererInfoService;
@Service
public class DelivererInfoServiceImpl implements DelivererInfoService{
	@Autowired
	private DelivererInfoMapper delivererInfoMapper;
	@Override
	public PageObject<DelivererInfo> findPageObjects(String delivererName, Integer pageCurrent) {
		//1.验证参数合法性(pageCurrent)
		if(pageCurrent==null||pageCurrent<1)
		throw new IllegalArgumentException("页码值无效");
		//2.按照条件查询总记录数并进行校验
		int rowCount=delivererInfoMapper.getRowCount(delivererName);
		if(rowCount==0)
		throw new IllegalArgumentException("没有对应记录");
		//3.按照条件查询当前页记录
		int pageSize=3;
		int startIndex=(pageCurrent-1)*pageSize;
		List<DelivererInfo> records=
		delivererInfoMapper.findPageObjects(delivererName,
				startIndex, pageSize);
		//4.封装查询结果并返回
		PageObject<DelivererInfo> pageObject=new PageObject<DelivererInfo>();
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
	public int updateByDelivererId(long delivererId) {
		int update = delivererInfoMapper.updateByDelivererId(delivererId);
		return update;
	}
	//恢复买家
	@Override
	public int resumeByDelivererId(long delivererId) {
		int resume=delivererInfoMapper.resumeByDelivererId(delivererId);
		return resume;
	}
}
