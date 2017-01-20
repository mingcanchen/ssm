package com.ming.ssm.persist.service;

import com.ming.ssm.model.CustomerPO;
import com.ming.ssm.model.CustomerVO;

import java.util.List;

/**
 * Created by chenmingcan on 2017/1/18.
 */
public interface ICustomerService {

    CustomerPO getCustomerById(String id);

    List<CustomerPO> getCustomerList(CustomerVO customerVO);

    int addCustomer(CustomerPO customerPO);
}
