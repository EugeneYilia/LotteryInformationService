package com.eugenestudio.EugeneWechatServer.controller;

import com.eugenestudio.EugeneWechatServer.service.AgentService;
import com.eugenestudio.EugeneWechatServer.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@Controller("agentController")
public class AgentController {

    @Autowired
    @Resource(name = "agentService")
    private AgentService agentService;

    @Autowired
    @Resource(name = "userService")
    private UserInformationService userInformationService;

    @ResponseBody
    @PostMapping(value = "/getOpenid",produces = {"application/json;charset=utf-8"})
    public Object getOpenid(@RequestBody Map<String,Object> requestMap) {
        String sourceURL = requestMap.get("url").toString();
        //System.out.println(sourceURL);
        String openid = agentService.getOpenid(sourceURL);

        userInformationService.isNew(openid);
        //System.out.println(openid);
        return openid;
    }
}