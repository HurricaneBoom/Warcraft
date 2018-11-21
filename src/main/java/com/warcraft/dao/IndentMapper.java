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
}