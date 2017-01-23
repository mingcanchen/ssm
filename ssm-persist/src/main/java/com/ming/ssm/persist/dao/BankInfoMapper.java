package com.ming.ssm.persist.dao;

import com.ming.ssm.model.BankInfoPO;
import org.springframework.stereotype.Repository;

@Repository
public interface BankInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BankInfoPO record);

    int insertSelective(BankInfoPO record);

    BankInfoPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BankInfoPO record);

    int updateByPrimaryKey(BankInfoPO record);
}