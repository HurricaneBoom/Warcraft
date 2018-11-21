package com.warcraft.dao;

import com.warcraft.pojo.DelivererOrder;
import com.warcraft.pojo.DelivererOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DelivererOrderMapper {
    int countByExample(DelivererOrderExample example);

    int deleteByExample(DelivererOrderExample example);

    int deleteByPrimaryKey(Long delivererId);

    List<DelivererOrder> selectByExample(DelivererOrderExample example);

    DelivererOrder selectByPrimaryKey(Long delivererId);

    int updateByExampleSelective(@Param("record") DelivererOrder record, @Param("example") DelivererOrderExample example);

    int updateByExample(@Param("record") DelivererOrder record, @Param("example") DelivererOrderExample example);

    int updateByPrimaryKeySelective(DelivererOrder record);

    int updateByPrimaryKey(DelivererOrder record);
     
    List<DelivererOrder> selectAll();
    
    List<DelivererOrder> selectComplete();
    
    int updateEndtime(Long indentId);
    
    int udpateIndentStatus(Long indentId);

    
}