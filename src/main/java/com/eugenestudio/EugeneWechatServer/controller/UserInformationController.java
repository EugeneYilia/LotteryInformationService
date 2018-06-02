package com.eugenestudio.EugeneWechatServer.controller;

import com.eugenestudio.EugeneWechatServer.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller("userInformationController")
@RequestMapping("/user")
public class UserInformationController {

    @Autowired
    @Resource(name = "userService")
    private UserInformationService userInformationService;

    @ResponseBody
    @RequestMapping(value = "/isSignIn", produces = {"application/json;charset=utf-8"})
    public Object isSignIn(@RequestBody Map<String, Object> requestMap) {
        return userInformationService.isSignIn(requestMap.get("openid").toString());
    }

    @ResponseBody
    @RequestMapping(value = "/signIn", produces = {"application/json;charset=utf-8"})
    public Object signIn(@RequestBody Map<String, Object> requestMap) {
        return userInformationService.signIn(requestMap.get("openid").toString());
    }

    @ResponseBody
    @RequestMapping(value = "/continuousSignInDays",produces = {"application/json;charset=utf-8"})
    public Object getContinousSignInDays(@RequestBody Map<String,Object> requestMap){
        return userInformationService.getContinuousSignInDays(requestMap.get("openid").toString());
    }
}
