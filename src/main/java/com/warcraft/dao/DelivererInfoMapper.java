package com.warcraft.dao;

import com.warcraft.pojo.BuyerInfo;
import com.warcraft.pojo.DelivererInfo;
import com.warcraft.pojo.DelivererInfoExample;

import java.nio.channels.ScatteringByteChannel;
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
    
    
    int updateStateById(Integer id);
    
    int updateStateById1(Integer id);
    
    DelivererInfo findObject(@Param("username")String username,
    		@Param("password")String password);
}