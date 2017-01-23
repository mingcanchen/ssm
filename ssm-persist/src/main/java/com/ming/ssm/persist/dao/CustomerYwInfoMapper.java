package com.ming.ssm.persist.dao;

import com.ming.ssm.model.CustomerYwInfoPO;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerYwInfoMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(CustomerYwInfoPO record);

    int insertSelective(CustomerYwInfoPO record);

    CustomerYwInfoPO selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(CustomerYwInfoPO record);

    int updateByPrimaryKey(CustomerYwInfoPO record);
}