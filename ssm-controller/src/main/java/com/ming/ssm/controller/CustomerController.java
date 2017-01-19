package com.ming.ssm.controller;

import com.ming.ssm.model.CustomerPO;
import com.ming.ssm.persist.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by chenmingcan on 2017/1/18.
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Resource
    private ICustomerService customerServiceImpl;

    @RequestMapping(method = RequestMethod.GET)
    public String getCustomerById(int id, ModelMap modelMap) {
        CustomerPO customer = customerServiceImpl.getCustomerById(id);
        modelMap.put("customer", customer);
        return "customer/customerInfo";
    }

}
