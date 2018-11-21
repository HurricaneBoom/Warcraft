package com.warcraft.mapper;

import com.warcraft.pojo.StoreInfo;
import com.warcraft.pojo.StoreInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreInfoMapper {
    int countByExample(StoreInfoExample example);

    int deleteByExample(StoreInfoExample example);

    int deleteByPrimaryKey(Long storeId);

    int insert(StoreInfo record);

    int insertSelective(StoreInfo record);

    List<StoreInfo> selectByExample(StoreInfoExample example);

    StoreInfo selectByPrimaryKey(Long storeId);

    int updateByExampleSelective(@Param("record") StoreInfo record, @Param("example") StoreInfoExample example);

    int updateByExample(@Param("record") StoreInfo record, @Param("example") StoreInfoExample example);

    int updateByPrimaryKeySelective(StoreInfo record);

    int updateByPrimaryKey(StoreInfo record);
    
    
}