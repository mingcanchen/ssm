package com.ming.ssm.persist.service.impl;

import com.ming.ssm.model.MessagePO;
import com.ming.ssm.persist.dao.MessageMapper;
import com.ming.ssm.persist.service.IMessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chenmingcan on 2017/1/23.
 */
@Service
public class MessageServiceImpl implements IMessageService {
    @Resource
    private MessageMapper messageMapper;

    @Override
    public MessagePO selectByPrimaryKey(long sn) {
        return messageMapper.selectByPrimaryKey(sn);
    }
}
