package com.warcraft.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.warcraft.pojo.Indent;

public interface IndentService {
	int insertIndent();
	
	int deleteById(@Param("indentId")Integer indentId);
	
	List<Indent> findIndentObject();
}
