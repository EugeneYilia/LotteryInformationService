package com.eugenestudio.EugeneWechatServer.service.impl;

import com.eugenestudio.EugeneWechatServer.mapper.SportsMatchMapper;
import com.eugenestudio.EugeneWechatServer.model.SportsBLOB;
import com.eugenestudio.EugeneWechatServer.model.SportsMatch;
import com.eugenestudio.EugeneWechatServer.service.MatchInformationService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("matchService")
public class MatchInformationServiceImpl implements MatchInformationService{

    @Autowired
    private SportsMatchMapper sportsMatchMapper;

    @Override
    public List<SportsMatch> findMatches(int startNumber, int endNumber) {
        return sportsMatchMapper.selectSportsMatchByStartNumberAndCount(startNumber,endNumber);
    }

    @Override
    public SportsBLOB findMatchArray(int id) {
        return sportsMatchMapper.selectSportsMatchArrayById(id);
    }

    @Override
    public List<SportsMatch> findAllMatch(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return sportsMatchMapper.selectAllMatch();
    }

    @Override
    public List<SportsMatch> searchContent(String content) {
        return sportsMatchMapper.selectSearchContent(content);
    }
}
