package com.ming.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ming.ssm.framework.thrift.proxy.DynamicClientProxyFactory;
import com.ming.ssm.model.CustomerPO;
import com.ming.ssm.model.CustomerVO;
import com.ming.ssm.persist.service.ICustomerService;
import com.ming.thrift.service.User;
import com.ming.thrift.service.UserService;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

/**
 * Created by chenmingcan on 2017/1/18.
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Resource
    private ICustomerService customerServiceImpl;

//    @Resource
//    private UserService.Iface userService;

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
        LOGGER.info("==========用户返回:" + JSON.toJSONString(customerList));
        PageInfo<CustomerPO> pageInfo = new PageInfo<>(customerList);
        if (customerList.size() > 0) {
            modelMap.put("pageInfo", pageInfo);
            modelMap.put("code", "0000");
        } else {
            modelMap.put("code", "9999");
        }
        return "customer/customerList";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addCustomer(CustomerPO customerPO, ModelMap modelMap) {
        customerPO.setActivation(1);
        customerPO.setAuditStatus(2);
        customerPO.setChargeType(0);
        customerPO.setCustomerId(UUID.randomUUID().toString());
        customerPO.setCustomerName("user3");
        customerPO.setCustomerPwd("a123456");
        customerPO.setCustType(0);
        customerPO.setEmail("user3@jiweitech.com");
        customerPO.setFinanceId(UUID.randomUUID().toString());
        customerPO.setMobile("18655556666");
        customerPO.setPayType(0);
        customerPO.setPhone("80809090");
        customerPO.setStatus(0);
        int sn = customerServiceImpl.addCustomer(customerPO);
        LOGGER.info(sn + "");
        return "customer/customerInfo";
    }

    @RequestMapping(value = "/detial", method = RequestMethod.GET)
    public String getCustomerDetail(String customerId) {
        CustomerPO customerPO = customerServiceImpl.getCustomerDetail(customerId);
        LOGGER.info("测试用户详情:" + JSON.toJSONString(customerPO));
        return "";
    }

    @RequestMapping(value = "test")
    @ResponseBody
    public ModelMap testJson(ModelMap modelMap) {
        modelMap.put("code", "2000");
        modelMap.put("message", "请求成功");
        return modelMap;
    }
/*
    @RequestMapping(value = "getUser")
    public  String getUser (){
//        UserService.Iface userService = (UserService.Iface) DynamicClientProxyFactory.createIface("com.ming.thrift.service.UserService", "192.168.62.224:9090", "UserService");
//        System.out.println(userService);
        try {
            userService.store1(new User(888, "tom" , "haha" ) );
        } catch (TException e) {
            e.printStackTrace();
        }
        return null;
    }*/

    @RequestMapping(value = "/getRealIp")
    @ResponseBody
    public String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("X-Real-IP");
        if (!StringUtils.isEmpty(ip) && !"unknown".equalsIgnoreCase(ip)) {
            return ip;
        }
        ip = request.getHeader("X-Forwarded-For");
        if (!StringUtils.isEmpty(ip) && !"unknown".equalsIgnoreCase(ip)) {
            // 多次反向代理后会有多个IP值，第一个为真实IP。
            int index = ip.indexOf(',');
            if (index != -1) {
                return ip.substring(0, index);
            } else {
                return ip;
            }
        } else {
            return request.getRemoteAddr();
        }
    }
}
