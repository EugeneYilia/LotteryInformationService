package com.eugenestudio.EugeneWechatServer.service.impl;

import com.eugenestudio.EugeneWechatServer.mapper.UserInformationMapper;
import com.eugenestudio.EugeneWechatServer.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserInformationServiceImpl implements UserInformationService {

    @Autowired
    private UserInformationMapper userInformationMapper;

    @Override
    public boolean isSignIn() {
        return userInformationMapper.isSignIn();
    }

    @Override
    public boolean signIn() {
        return userInformationMapper.signIn();
    }
}
