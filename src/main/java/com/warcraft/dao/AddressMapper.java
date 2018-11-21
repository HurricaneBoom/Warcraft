package com.warcraft.dao;

import com.warcraft.pojo.Address;
import com.warcraft.pojo.AddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressMapper {
	
	int insertAddressCon(@Param("addressCon")String addressCon);
	
	
    int countByExample(AddressExample example);

    int deleteByExample(AddressExample example);

    int deleteByPrimaryKey(Long addressId);

    int insert(Address record);

    int insertSelective(Address record);

    List<Address> selectByExample(AddressExample example);

    Address selectByPrimaryKey(Long addressId);

    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}