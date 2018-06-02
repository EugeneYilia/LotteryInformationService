package com.eugenestudio.EugeneWechatServer.mapper;

import com.eugenestudio.EugeneWechatServer.model.UserInformation;

public interface UserInformationMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserInformation record);

    int insertSelective(UserInformation record);

    UserInformation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserInformation record);

    int updateByPrimaryKey(UserInformation record);
}