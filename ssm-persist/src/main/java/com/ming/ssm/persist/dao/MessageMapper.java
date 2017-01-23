package com.ming.ssm.persist.dao;

import com.ming.ssm.model.MessagePO;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(MessagePO record);

    int insertSelective(MessagePO record);

    MessagePO selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(MessagePO record);

    int updateByPrimaryKeyWithBLOBs(MessagePO record);

    int updateByPrimaryKey(MessagePO record);
}