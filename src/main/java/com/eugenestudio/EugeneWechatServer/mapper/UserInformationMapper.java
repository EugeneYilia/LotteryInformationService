package com.eugenestudio.EugeneWechatServer.mapper;

import com.eugenestudio.EugeneWechatServer.model.UserInformation;
import org.apache.ibatis.annotations.Param;

public interface UserInformationMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserInformation record);

    int insertSelective(UserInformation record);

    UserInformation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserInformation record);

    int updateByPrimaryKey(UserInformation record);

    //boolean isSignIn();

    String getNewestDate(@Param("openid") String openid);

    int getScore(@Param("openid") String openid);

    int getContinuousDays(@Param("openid") String openid);

    boolean signIn();

    UserInformation isNew(String openid);

    int getDifferenceOfDate(@Param("todayDate") String todayDate,@Param("lastSignInDate") String lastSignInDate);
}