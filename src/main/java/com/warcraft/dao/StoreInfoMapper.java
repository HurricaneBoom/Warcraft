package com.warcraft.dao;

import com.warcraft.pojo.BossInfo;
import com.warcraft.pojo.StoreInfo;
import com.warcraft.pojo.StoreInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreInfoMapper {
	
	List<StoreInfo> doQueryObjectsByName(@Param("storeName") String storeName);
	
	List<StoreInfo> findObjects();
	
	
	
	
	
	
	
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