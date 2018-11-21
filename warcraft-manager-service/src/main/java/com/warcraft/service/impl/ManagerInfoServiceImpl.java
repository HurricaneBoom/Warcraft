package com.warcraft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;

import com.warcraft.common.utils.JsonUtils;
import com.warcraft.jedis.JedisClient;
import com.warcraft.mapper.ManagerInfoMapper;
import com.warcraft.pojo.ManagerInfo;
import com.warcraft.service.ManagerInfoService;
@Service
public class ManagerInfoServiceImpl implements ManagerInfoService {
	@Autowired
	private ManagerInfoMapper managerInfoMapper;
	@Autowired
	private JedisClient JedisClient;
	@Value("${INDEX_MANAGERINFO}")
	private String INDEX_MANAGERINFO;
	@Override
	public ManagerInfo getInfoByID(long managerId) {
		//先查询缓存
		//添加缓存不能影响正常业务逻辑
		try {
			//查询缓存
			String json=JedisClient.hget(INDEX_MANAGERINFO, managerId+"");
			//查询到结果，把json转换成buyer返回
			if(StringUtils.isNotBlank(json)) {
				ManagerInfo managerInfo = JsonUtils.jsonToPojo(json,ManagerInfo.class);
				return managerInfo;
			}
		} catch (Exception e) {
		}
		//缓存中没有命中，需要查询数据库
		ManagerInfo managerInfo =managerInfoMapper.selectByPrimaryKey(managerId);
		//把结果添加到缓存
		try {
			JedisClient.hset("INDEX_MANAGERINFO", managerId+"", JsonUtils.objectToJson(managerInfo));
		} catch (Exception e) {
		}
		return managerInfo;
	}

}
