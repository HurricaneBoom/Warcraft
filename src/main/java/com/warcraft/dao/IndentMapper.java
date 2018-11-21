package com.warcraft.dao;

import com.warcraft.pojo.Indent;
import com.warcraft.pojo.IndentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndentMapper {
    int countByExample(IndentExample example);

    int deleteByExample(IndentExample example);

    int deleteByPrimaryKey(Long indentId);

    int insert(Indent record);

    int insertSelective(Indent record);

    List<Indent> selectByExample(IndentExample example);

    Indent selectByPrimaryKey(Long indentId);

    int updateByExampleSelective(@Param("record") Indent record, @Param("example") IndentExample example);

    int updateByExample(@Param("record") Indent record, @Param("example") IndentExample example);

    int updateByPrimaryKeySelective(Indent record);

    int updateByPrimaryKey(Indent record);
    
    //全部订单
    
    List<Indent> doAllIndent(Long indentId );
    //支付订单
    List<Indent> selectIndent(Long indentId );
    
    int updateIndentAccepted(Long indentId);

	List<Indent> doJieShou(Long indentId);

	int updateIndentCancel(long indentId);

	List<Indent> doCanceling(Long indentId);


	
}