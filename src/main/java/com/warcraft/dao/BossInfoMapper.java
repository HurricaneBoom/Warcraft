package com.warcraft.dao;

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
}