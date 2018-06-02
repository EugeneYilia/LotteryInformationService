package com.eugenestudio.EugeneWechatServer.service;

public interface UserInformationService {
    boolean isSignIn(String openid);
    boolean signIn(String openid);
    void isNew(String openid);
    int getContinuousSignInDays(String openid);
}
