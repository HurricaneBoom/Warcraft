package com.warcraft.mapper;

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
    
    List<DelivererInfo> findPageObjects(
			 @Param("delivererName") String delivererName,
			 @Param("startIndex") Integer startIndex,
			 @Param("pageSize") Integer pageSize);
	 /**
	  * 按照查询条件统计用户操作日志数
	  * @param username (用户名)
	  * @return 查询到的记录数,按照这个值以及pageSize
	  * 计算总页数
	  */
	 int getRowCount(@Param("delivererName") String delivererName);
	 
	 int updateByDelivererId(@Param("delivererId")long delivererId);
	 
	 int resumeByDelivererId(@Param("delivererId")long delivererId);
}