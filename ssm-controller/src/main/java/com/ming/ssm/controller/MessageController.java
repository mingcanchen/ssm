package com.ming.ssm.controller;

import com.ming.ssm.model.MessagePO;
import com.ming.ssm.persist.service.IMessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by chenmingcan on 2017/1/23.
 */
@Controller
@RequestMapping(value = "message")
public class MessageController {

    @Resource
    private IMessageService messageServiceImpl;

    @RequestMapping(value = "/sn",method = RequestMethod.GET)
    public String getMessageInfoById(long sn, ModelMap modelMap){
        MessagePO messagePO = messageServiceImpl.selectByPrimaryKey(sn);
        modelMap.put("message",messagePO);
        return "";
    }
}
