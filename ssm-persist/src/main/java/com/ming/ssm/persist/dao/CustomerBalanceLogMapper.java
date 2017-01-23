package com.ming.ssm.persist.dao;

import com.ming.ssm.model.CustomerBalanceLogPO;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerBalanceLogMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(CustomerBalanceLogPO record);

    int insertSelective(CustomerBalanceLogPO record);

    CustomerBalanceLogPO selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(CustomerBalanceLogPO record);

    int updateByPrimaryKey(CustomerBalanceLogPO record);
}