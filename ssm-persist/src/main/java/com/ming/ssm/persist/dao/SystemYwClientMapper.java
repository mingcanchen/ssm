package com.ming.ssm.persist.dao;

import com.ming.ssm.model.SystemYwClientPO;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemYwClientMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(SystemYwClientPO record);

    int insertSelective(SystemYwClientPO record);

    SystemYwClientPO selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(SystemYwClientPO record);

    int updateByPrimaryKey(SystemYwClientPO record);
}