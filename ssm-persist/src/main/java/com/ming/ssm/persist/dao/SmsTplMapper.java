package com.ming.ssm.persist.dao;

import com.ming.ssm.model.SmsTplPO;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsTplMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(SmsTplPO record);

    int insertSelective(SmsTplPO record);

    SmsTplPO selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(SmsTplPO record);

    int updateByPrimaryKey(SmsTplPO record);
}