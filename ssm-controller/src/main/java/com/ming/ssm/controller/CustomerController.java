package com.ming.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ming.ssm.model.CustomerPO;
import com.ming.ssm.model.CustomerVO;
import com.ming.ssm.persist.service.ICustomerService;
import com.sun.org.apache.regexp.internal.RE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chenmingcan on 2017/1/18.
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Resource
    private ICustomerService customerServiceImpl;

    private final static Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    @RequestMapping(value = "/{customeId}", method = RequestMethod.GET)
    public String getCustomerById(@PathVariable("customeId") String customerId, ModelMap modelMap) {
        CustomerPO customer = customerServiceImpl.getCustomerById(customerId);
        modelMap.put("customer", customer);
        return "customer/customerInfo";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getCustomerList(CustomerVO customerVO, ModelMap modelMap) {
        PageHelper.startPage(1, 10);
        PageHelper.orderBy("insert_time");
        List<CustomerPO> customerList = customerServiceImpl.getCustomerList(customerVO);
        LOGGER.info("==========用户返回:"+ JSON.toJSONString(customerList));
        PageInfo<CustomerPO> pageInfo = new PageInfo<>(customerList);
        if (customerList.size() > 0) {
            modelMap.put("pageInfo", pageInfo);
            modelMap.put("code", "0000");
        } else {
            modelMap.put("code", "9999");
        }
        return "customer/customerList";
    }

}
