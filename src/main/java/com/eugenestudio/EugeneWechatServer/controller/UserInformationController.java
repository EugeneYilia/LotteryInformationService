package com.eugenestudio.EugeneWechatServer.controller;

import com.eugenestudio.EugeneWechatServer.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller("userInformationController")
@RequestMapping("/user")
public class UserInformationController {

    @Autowired
    @Resource(name = "userService")
    private UserInformationService userInformationService;

    @ResponseBody
    @RequestMapping(value = "/isSignIn",produces = {"application/json;charset=utf-8"})
    public Object isSignIn(){
        return userInformationService.isSignIn();
    }

    @ResponseBody
    @RequestMapping(value = "signIn",produces = {"application/json;chartset=utf-8"})
    public Object signIn(){
        return userInformationService.signIn();
    }
}
