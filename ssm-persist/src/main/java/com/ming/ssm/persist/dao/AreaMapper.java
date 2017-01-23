package com.ming.ssm.persist.dao;

import com.ming.ssm.model.AreaPO;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(AreaPO record);

    int insertSelective(AreaPO record);

    AreaPO selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(AreaPO record);

    int updateByPrimaryKey(AreaPO record);
}