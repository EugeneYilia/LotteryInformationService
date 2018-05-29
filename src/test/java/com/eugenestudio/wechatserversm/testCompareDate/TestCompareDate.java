package com.eugenestudio.wechatserversm.testCompareDate;

public class TestCompareDate {
    public static void main(String[] args) {//第一个时间比第二个时间早会返回-1
        String beginTime=new String("2014-08-15 10:22:22");
        String endTime=new String("2014-09-02 11:22:22");
        System.out.println(beginTime.compareTo(endTime));
    }
}
