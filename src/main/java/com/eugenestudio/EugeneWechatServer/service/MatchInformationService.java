package com.eugenestudio.EugeneWechatServer.service;

import com.eugenestudio.EugeneWechatServer.model.SportsBLOB;
import com.eugenestudio.EugeneWechatServer.model.SportsMatch;
import com.eugenestudio.EugeneWechatServer.model.SportsMatchWithBLOBs;

import java.util.List;

public interface MatchInformationService {
    List<SportsMatch> findMatches(int startNumber,int endNumber);
    SportsBLOB findMatchArray(int id);
    List<SportsMatch> findAllMatch(int pageNum,int pageSize);
}
