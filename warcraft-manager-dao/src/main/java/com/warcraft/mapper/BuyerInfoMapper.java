package com.warcraft.mapper;

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
    
    List<BuyerInfo> findAll();
    
    List<BuyerInfo> findPageObjects(
			 @Param("buyerName") String buyerName,
			 @Param("startIndex") Integer startIndex,
			 @Param("pageSize") Integer pageSize);
	 /**
	  * 按照查询条件统计用户操作日志数
	  * @param username (用户名)
	  * @return 查询到的记录数,按照这个值以及pageSize
	  * 计算总页数
	  */
	 int getRowCount(@Param("buyerName") String buyerName);
	 
	 int updateByBuyerId(@Param("buyerId")long buyerId);
	 
	 int resumeByBuyerId(@Param("buyerId")long buyerId);
}