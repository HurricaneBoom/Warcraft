package com.warcraft.service;

import java.util.List;

import com.warcraft.pojo.DelivererOrder;

public interface DelivererOrderService {
	List<DelivererOrder> selectAll();
	 List<DelivererOrder> selectComplete();
	int udpateIndentStatus(Long indentId);
}
