package com.ming.ssm.persist.dao;

import com.ming.ssm.model.IdCardDataPO;
import org.springframework.stereotype.Repository;

@Repository
public interface IdCardDataMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(IdCardDataPO record);

    int insertSelective(IdCardDataPO record);

    IdCardDataPO selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(IdCardDataPO record);

    int updateByPrimaryKey(IdCardDataPO record);
}