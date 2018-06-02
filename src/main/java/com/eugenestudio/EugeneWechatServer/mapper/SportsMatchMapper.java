package com.eugenestudio.EugeneWechatServer.mapper;

import com.eugenestudio.EugeneWechatServer.model.SportsBLOB;
import com.eugenestudio.EugeneWechatServer.model.SportsMatch;
import com.eugenestudio.EugeneWechatServer.model.SportsMatchWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;

import java.util.List;
public interface SportsMatchMapper {
    int deleteByPrimaryKey(Integer count);

    int insert(SportsMatchWithBLOBs record);

    int insertSelective(SportsMatchWithBLOBs record);

    SportsMatchWithBLOBs selectByPrimaryKey(Integer count);

    int updateByPrimaryKeySelective(SportsMatchWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SportsMatchWithBLOBs record);

    int updateByPrimaryKey(SportsMatch record);

    List<SportsMatch> selectSportsMatchByStartNumberAndCount(@Param("startNumber") int startNumber, @Param("endNumber") int endNumber);

    SportsBLOB selectSportsMatchArrayById(@Param("id") int id);

    List<SportsMatch> selectAllMatch();

    List<SportsMatch> selectSearchContent(@Param("content") String content);
}