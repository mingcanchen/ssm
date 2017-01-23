package com.ming.ssm.persist.service;

import com.ming.ssm.model.MessagePO;

/**
 * Created by chenmingcan on 2017/1/23.
 */
public interface IMessageService {
    MessagePO selectByPrimaryKey(long sn);
}
