package com.ming.ssm.persist.service;

import com.ming.ssm.model.CustomerPO;

/**
 * Created by chenmingcan on 2017/1/18.
 */
public interface ICustomerService {
    CustomerPO getCustomerById(int id);
}
