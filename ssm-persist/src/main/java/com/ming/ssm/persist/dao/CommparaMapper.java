package com.ming.ssm.persist.dao;

import com.ming.ssm.model.CommparaPO;
import org.springframework.stereotype.Repository;

@Repository
public interface CommparaMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(CommparaPO record);

    int insertSelective(CommparaPO record);

    CommparaPO selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(CommparaPO record);

    int updateByPrimaryKey(CommparaPO record);
}