package com.warcraft.dao;

import com.warcraft.pojo.Abolish;
import com.warcraft.pojo.AbolishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AbolishMapper {
    int countByExample(AbolishExample example);

    int deleteByExample(AbolishExample example);

    int deleteByPrimaryKey(Long abolishId);

    int insert(Abolish record);

    int insertSelective(Abolish record);

    List<Abolish> selectByExample(AbolishExample example);

    Abolish selectByPrimaryKey(Long abolishId);

    int updateByExampleSelective(@Param("record") Abolish record, @Param("example") AbolishExample example);

    int updateByExample(@Param("record") Abolish record, @Param("example") AbolishExample example);

    int updateByPrimaryKeySelective(Abolish record);

    int updateByPrimaryKey(Abolish record);
}