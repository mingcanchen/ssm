package com.ming.ssm.persist.service.impl;

import com.ming.ssm.model.CustomerPO;
import com.ming.ssm.persist.dao.CustomerMapper;
import com.ming.ssm.persist.service.ICustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chenmingcan on 2017/1/18.
 */
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Resource
    private CustomerMapper customerMapper;

    public CustomerPO getCustomerById(int id) {
        return customerMapper.getCustomerById(id);
    }
}
