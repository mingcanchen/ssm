package com.ming.ssm.persist.dao;

import com.ming.ssm.model.TrackingSmsPO;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingSmsMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(TrackingSmsPO record);

    int insertSelective(TrackingSmsPO record);

    TrackingSmsPO selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(TrackingSmsPO record);

    int updateByPrimaryKey(TrackingSmsPO record);
}