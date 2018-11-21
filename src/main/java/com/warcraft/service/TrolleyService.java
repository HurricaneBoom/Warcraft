package com.warcraft.service;

import com.warcraft.pojo.Trolley;

public interface TrolleyService {
	int insertTrolley(Trolley trolley);
	
	int deleteTrolley(Long dietId);
}
