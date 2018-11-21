package com.warcraft.dao;

import com.warcraft.pojo.DelivererInfo;
import com.warcraft.pojo.DelivererInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DelivererInfoMapper {
    int countByExample(DelivererInfoExample example);

    int deleteByExample(DelivererInfoExample example);

    int deleteByPrimaryKey(Long delivererId);

    int insert(DelivererInfo record);

    int insertSelective(DelivererInfo record);

    List<DelivererInfo> selectByExample(DelivererInfoExample example);

    DelivererInfo selectByPrimaryKey(Long delivererId);

    int updateByExampleSelective(@Param("record") DelivererInfo record, @Param("example") DelivererInfoExample example);

    int updateByExample(@Param("record") DelivererInfo record, @Param("example") DelivererInfoExample example);

    int updateByPrimaryKeySelective(DelivererInfo record);

    int updateByPrimaryKey(DelivererInfo record);
}