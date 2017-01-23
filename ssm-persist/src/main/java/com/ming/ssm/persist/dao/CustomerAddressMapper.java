package com.ming.ssm.persist.dao;

import com.ming.ssm.model.CustomerAddressPO;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerAddressMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(CustomerAddressPO record);

    int insertSelective(CustomerAddressPO record);

    CustomerAddressPO selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(CustomerAddressPO record);

    int updateByPrimaryKey(CustomerAddressPO record);
}