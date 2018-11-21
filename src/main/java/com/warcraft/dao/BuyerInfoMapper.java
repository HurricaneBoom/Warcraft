package com.warcraft.dao;

import com.warcraft.pojo.BuyerInfo;
import com.warcraft.pojo.BuyerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyerInfoMapper {
    int countByExample(BuyerInfoExample example);

    int deleteByExample(BuyerInfoExample example);

    int deleteByPrimaryKey(Long buyerId);

    int insert(BuyerInfo record);

    int insertSelective(BuyerInfo record);

    List<BuyerInfo> selectByExample(BuyerInfoExample example);

    BuyerInfo selectByPrimaryKey(Long buyerId);

    int updateByExampleSelective(@Param("record") BuyerInfo record, @Param("example") BuyerInfoExample example);

    int updateByExample(@Param("record") BuyerInfo record, @Param("example") BuyerInfoExample example);

    int updateByPrimaryKeySelective(BuyerInfo record);

    int updateByPrimaryKey(BuyerInfo record);
}