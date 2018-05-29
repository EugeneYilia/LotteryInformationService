package com.eugenestudio.EugeneWechatServer.controller;

import com.eugenestudio.EugeneWechatServer.service.MatchInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller("matchInformation")
@RequestMapping("/match")
public class matchInformationController {
    @Autowired
    @Resource(name = "matchService")
    private MatchInformationService matchInformationService;

    @ResponseBody
    @RequestMapping(value = "/matchInformation/{startNumber}/{endNumber}", produces = {"application/json;charset=utf-8"})
    public Object findMatchInformation(@PathVariable("startNumber") int startNumber, @PathVariable("endNumber") int endNumber) {
        return matchInformationService.findMatches(startNumber, endNumber);
    }

    @ResponseBody
    @RequestMapping(value = "/matchArray/{id}", produces = {"application/json;charset=utf-8"})
    public Object findMatchArray(@PathVariable("id") int id) {
        return matchInformationService.findMatchArray(id);
    }

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}",produces = {"application/json;charset=utf-8"})
    public Object findAllMatch(@PathVariable("pageNum") int pageNum,@PathVariable("pageSize") int pageSize){
        return matchInformationService.findAllMatch(pageNum,pageSize);
    }
}
