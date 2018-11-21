package com.warcraft.sso.service;

import com.warcraft.common.pojo.WarcraftResult;
import com.warcraft.pojo.ManagerInfo;

public interface ManagerInfoService {
	WarcraftResult register(ManagerInfo managerInfo);
	WarcraftResult login(String managerUsername,String managerPassword);
	WarcraftResult getMangerInfoByToken(String token);
}
