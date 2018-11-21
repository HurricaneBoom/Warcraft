package com.warcraft.service;

import java.util.List;

import com.warcraft.pojo.Indent;

public interface IndentService {
	List<Indent> findAcceptedIndent();
	
	int updateIndentDelivering();
}
