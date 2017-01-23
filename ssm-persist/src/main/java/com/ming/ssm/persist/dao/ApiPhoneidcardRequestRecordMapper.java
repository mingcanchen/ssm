package com.ming.ssm.persist.dao;

import com.ming.ssm.model.ApiPhoneidcardRequestRecordPO;
import com.ming.ssm.model.ApiPhoneidcardRequestRecordPOWithBLOBs;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiPhoneidcardRequestRecordMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(ApiPhoneidcardRequestRecordPOWithBLOBs record);

    int insertSelective(ApiPhoneidcardRequestRecordPOWithBLOBs record);

    ApiPhoneidcardRequestRecordPOWithBLOBs selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(ApiPhoneidcardRequestRecordPOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ApiPhoneidcardRequestRecordPOWithBLOBs record);

    int updateByPrimaryKey(ApiPhoneidcardRequestRecordPO record);
}