package com.warcraft.service;

import java.util.List;

import com.warcraft.pojo.Indent;


public interface IndentService {
	List<Indent> selectIndent(Long indentId);
	
	int updateIndentAccepted(Long indentId);

	int updateIndentCancel(Long indentId);
	
	List<Indent> doAllIndent(Long indentId );

	List<Indent> doJieShou(Long indentId );
	
	List<Indent> doCanceling(Long indentId);
}
