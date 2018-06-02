package com.eugenestudio.EugeneWechatServer.service.impl;

import com.eugenestudio.EugeneWechatServer.mapper.UserInformationMapper;
import com.eugenestudio.EugeneWechatServer.model.UserInformation;
import com.eugenestudio.EugeneWechatServer.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service("userService")
public class UserInformationServiceImpl implements UserInformationService {

    @Autowired
    private UserInformationMapper userInformationMapper;

    @Override
    public boolean isSignIn(String openid) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String todayDate = simpleDateFormat.format(date);
        if (todayDate.equals(userInformationMapper.getNewestDate(openid))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean signIn(String openid) {
        //SELECT DATEDIFF('2015-06-29','2015-06-12') AS DiffDate; ->  17 返回两个日期相差的天数  前面的日期减去后面的日期
        //SELECT DATEDIFF('2015-06-12','2015-06-29') AS DiffDate; -> -17 返回两个日期相差的天数  前面的日期减去后面的日期
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String todayDate = simpleDateFormat.format(date);
        String lastSignInDate = userInformationMapper.getNewestDate(openid);
        int differenceOfDays = userInformationMapper.getDifferenceOfDate(todayDate, lastSignInDate);
        int score = userInformationMapper.getScore(openid);
        int continuousDays = userInformationMapper.getContinuousDays(openid);
        if (differenceOfDays > 1) {//出现断签情况
            score += 150;
            continuousDays = 0;
        } else {//处于连续签到的状态
            if (continuousDays == 1) {
                score += 150;
            } else if(continuousDays == 2 || continuousDays == 3){
                score += 200;
            } else if(continuousDays == 4 || continuousDays == 5){
                score += 250;
            } else if(continuousDays == 6){
                score += 500;
            } else{
                score += 150;
                continuousDays = 0;
            }
        }
        continuousDays++;
        UserInformation userInformation = new UserInformation(openid,continuousDays,score,todayDate);
        userInformationMapper.updateByPrimaryKey(userInformation);
        return true;
    }

    @Override
    public void isNew(String openid) {
        if (userInformationMapper.isNew(openid) == null) {
            userInformationMapper.insert(new UserInformation(openid, 0, 0, "-1"));
        }
    }

    @Override
    public int getContinuousSignInDays(String openid) {
        return userInformationMapper.getContinuousDays(openid);
    }
}
