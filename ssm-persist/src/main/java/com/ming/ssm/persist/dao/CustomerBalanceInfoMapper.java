package com.ming.ssm.persist.dao;

import com.ming.ssm.model.CustomerBalanceInfoPO;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerBalanceInfoMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(CustomerBalanceInfoPO record);

    int insertSelective(CustomerBalanceInfoPO record);

    CustomerBalanceInfoPO selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(CustomerBalanceInfoPO record);

    int updateByPrimaryKey(CustomerBalanceInfoPO record);
}