package com.ming.ssm.persist.service.impl;

import com.ming.ssm.model.CustomerPO;
import com.ming.ssm.model.CustomerVO;
import com.ming.ssm.persist.dao.CustomerMapper;
import com.ming.ssm.persist.service.ICustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chenmingcan on 2017/1/18.
 */
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public CustomerPO getCustomerById(String id) {
        return customerMapper.getCustomerById(id);
    }

    @Override
    public List<CustomerPO> getCustomerList(CustomerVO customerVO) {
        return customerMapper.getCustomerList(customerVO);
    }

    @Override
    public int addCustomer(CustomerPO customerPO) {

        return customerMapper.addCustomer(customerPO);
    }


}
