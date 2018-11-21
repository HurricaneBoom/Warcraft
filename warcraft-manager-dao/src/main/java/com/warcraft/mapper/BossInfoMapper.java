package com.warcraft.mapper;

import com.warcraft.pojo.BossInfo;
import com.warcraft.pojo.BossInfoExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BossInfoMapper {
    int countByExample(BossInfoExample example);

    int deleteByExample(BossInfoExample example);

    int deleteByPrimaryKey(Long bossId);

    int insert(BossInfo record);

    int insertSelective(BossInfo record);

    List<BossInfo> selectByExample(BossInfoExample example);

    BossInfo selectByPrimaryKey(Long bossId);

    int updateByExampleSelective(@Param("record") BossInfo record, @Param("example") BossInfoExample example);

    int updateByExample(@Param("record") BossInfo record, @Param("example") BossInfoExample example);

    int updateByPrimaryKeySelective(BossInfo record);

    int updateByPrimaryKey(BossInfo record);
    
    List<BossInfo> findPageObjects(
			 @Param("bossName") String bossName,
			 @Param("startIndex") Integer startIndex,
			 @Param("pageSize") Integer pageSize);
	 /**
	  * 按照查询条件统计用户操作日志数
	  * @param username (用户名)
	  * @return 查询到的记录数,按照这个值以及pageSize
	  * 计算总页数
	  */
	 int getRowCount(@Param("bossName") String bossName);
	 
	 int updateByStoreId(@Param("storeId")long storeId);
	 
	 int resumeByStoreId(@Param("storeId")long storeId);
}