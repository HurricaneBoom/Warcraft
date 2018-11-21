package com.warcraft.sso.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.warcraft.common.pojo.WarcraftResult;
import com.warcraft.common.utils.JsonUtils;
import com.warcraft.jedis.JedisClient;
import com.warcraft.mapper.ManagerInfoMapper;
import com.warcraft.pojo.ManagerInfo;
import com.warcraft.pojo.ManagerInfoExample;
import com.warcraft.pojo.ManagerInfoExample.Criteria;
import com.warcraft.sso.service.ManagerInfoService;

@Service
public class ManagerInfoServiceImpl implements ManagerInfoService {

	@Autowired
	private ManagerInfoMapper managerInfoMapper;
	@Autowired
	private JedisClient jedisClient;
	@Value("${MANAGER_INFO_SESSION}")
	private String MANAGER_INFO_SESSION;
	@Override
	public WarcraftResult register(ManagerInfo managerInfo) {
		//检查数据有效性
		if (StringUtils.isBlank(managerInfo.getManagerUsername())) {
			return WarcraftResult.build(400, "用户名不能为空");
		}
		//判断用户名是否重复
		//补全pojo的属性
		managerInfo.setMangerCreated(new Date());
		managerInfo.setMangerUpdated(new Date());
		//密码要进行md5加密
		String md5Pass = DigestUtils.md5DigestAsHex(managerInfo.getManagerPassword().getBytes());
		managerInfo.setManagerPassword(md5Pass);
		managerInfoMapper.insert(managerInfo);
		//插入数据
		return WarcraftResult.ok();
	}
	@Override
	public WarcraftResult login(String managerUsername, String managerPassword) {
		//判断用户名和密码是否正确
		ManagerInfoExample example = new ManagerInfoExample();
		Criteria Criteria = example.createCriteria();
		Criteria.andManagerUsernameEqualTo(managerUsername);
		List<ManagerInfo> list = managerInfoMapper.selectByExample(example);
		if(list==null||list.size()==0) {
			//返回登陆失败
			return WarcraftResult.build(400, "用户名或密码不正确");
		}
		ManagerInfo managerInfo=list.get(0);
		//密码要进行md5加密再校检
		if(!DigestUtils.md5DigestAsHex(managerPassword.getBytes())
				.equals(managerInfo.getManagerPassword())){
			//返回登陆失败
			return WarcraftResult.build(400, "用户名或密码不正确");
		}
		//生成token，使用uuid
		String token=UUID.randomUUID().toString();
		//把用户信息保存到redis，key就是token，value就是用户信息
		//清空密码
		managerInfo.setManagerPassword(null);
		jedisClient.set(MANAGER_INFO_SESSION+":"+token, JsonUtils.objectToJson(managerInfo));
		//设置key的过期时间
		jedisClient.expire(MANAGER_INFO_SESSION+":"+token, 1800);
		//返回登陆成功，其中要把token返回
		return WarcraftResult.ok(token);
	}
	@Override
	public WarcraftResult getMangerInfoByToken(String token) {
		String json = jedisClient.get(MANAGER_INFO_SESSION+":"+token);
		if (StringUtils.isBlank(json)) {
			return WarcraftResult.build(400, "用户登陆已经过期");
		}
		//重置session的过期时间
		jedisClient.expire(MANAGER_INFO_SESSION+":"+token, 1800);
		//把json转换成User对象
		ManagerInfo managerInfo=JsonUtils.jsonToPojo(json, ManagerInfo.class);
		return WarcraftResult.ok(managerInfo);
		//return WarcraftResult.ok(json);
	}

}
