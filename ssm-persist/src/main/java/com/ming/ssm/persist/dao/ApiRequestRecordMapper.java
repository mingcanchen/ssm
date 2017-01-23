package com.ming.ssm.persist.dao;

import com.ming.ssm.model.ApiRequestRecordPO;
import com.ming.ssm.model.ApiRequestRecordPOWithBLOBs;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiRequestRecordMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(ApiRequestRecordPOWithBLOBs record);

    int insertSelective(ApiRequestRecordPOWithBLOBs record);

    ApiRequestRecordPOWithBLOBs selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(ApiRequestRecordPOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ApiRequestRecordPOWithBLOBs record);

    int updateByPrimaryKey(ApiRequestRecordPO record);
}