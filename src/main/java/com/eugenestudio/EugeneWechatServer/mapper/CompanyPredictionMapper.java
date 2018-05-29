package com.eugenestudio.EugeneWechatServer.mapper;

import com.eugenestudio.EugeneWechatServer.model.CompanyPrediction;

public interface CompanyPredictionMapper {
    int deleteByPrimaryKey(Integer count);

    int insert(CompanyPrediction record);

    int insertSelective(CompanyPrediction record);

    CompanyPrediction selectByPrimaryKey(Integer count);

    int updateByPrimaryKeySelective(CompanyPrediction record);

    int updateByPrimaryKey(CompanyPrediction record);
}