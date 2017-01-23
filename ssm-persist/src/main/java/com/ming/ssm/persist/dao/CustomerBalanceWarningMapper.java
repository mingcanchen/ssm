package com.ming.ssm.persist.dao;

import com.ming.ssm.model.CustomerBalanceWarningPO;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerBalanceWarningMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(CustomerBalanceWarningPO record);

    int insertSelective(CustomerBalanceWarningPO record);

    CustomerBalanceWarningPO selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(CustomerBalanceWarningPO record);

    int updateByPrimaryKey(CustomerBalanceWarningPO record);
}