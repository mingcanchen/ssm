package com.ming.ssm.persist.dao;

import com.ming.ssm.model.CustomerBillDayPO;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerBillDayMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(CustomerBillDayPO record);

    int insertSelective(CustomerBillDayPO record);

    CustomerBillDayPO selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(CustomerBillDayPO record);

    int updateByPrimaryKey(CustomerBillDayPO record);
}