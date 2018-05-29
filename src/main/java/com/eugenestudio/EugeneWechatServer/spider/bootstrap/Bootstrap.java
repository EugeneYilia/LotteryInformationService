package com.eugenestudio.EugeneWechatServer.spider.bootstrap;


import com.eugenestudio.EugeneWechatServer.spider.lottery.football.Win_Draw_Lose_Odds;

public class Bootstrap {
    public static void main(String[] args) {
        Win_Draw_Lose_Odds win_draw_lose_odds = new Win_Draw_Lose_Odds();
        win_draw_lose_odds.start();
    }
}
