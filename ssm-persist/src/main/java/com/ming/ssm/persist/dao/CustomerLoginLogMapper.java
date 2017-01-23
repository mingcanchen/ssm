package com.ming.ssm.persist.dao;

import com.ming.ssm.model.CustomerLoginLogPO;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerLoginLogMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(CustomerLoginLogPO record);

    int insertSelective(CustomerLoginLogPO record);

    CustomerLoginLogPO selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(CustomerLoginLogPO record);

    int updateByPrimaryKey(CustomerLoginLogPO record);
}