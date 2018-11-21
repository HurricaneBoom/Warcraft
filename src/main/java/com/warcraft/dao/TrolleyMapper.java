package com.warcraft.dao;

import com.warcraft.pojo.Trolley;
import com.warcraft.pojo.TrolleyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrolleyMapper {
    int countByExample(TrolleyExample example);

    int deleteByExample(TrolleyExample example);

    int deleteByPrimaryKey(Long trolleyId);

    int insert(Trolley record);

    int insertSelective(Trolley record);

    List<Trolley> selectByExample(TrolleyExample example);

    Trolley selectByPrimaryKey(Long trolleyId);

    int updateByExampleSelective(@Param("record") Trolley record, @Param("example") TrolleyExample example);

    int updateByExample(@Param("record") Trolley record, @Param("example") TrolleyExample example);

    int updateByPrimaryKeySelective(Trolley record);

    int updateByPrimaryKey(Trolley record);
    
    int insertTrolley(Trolley trolley);
       
    int deleteTrolley(Long dietId);
}