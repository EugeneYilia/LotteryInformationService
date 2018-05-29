package com.eugenestudio.wechatserversm.testTrim;

public class TestTrim {
    //trim方法可以去掉字符串首尾的空格
    private static String string1 = " abc";
    private static String string2 = "bcd ";
    private static String string3 = " cde ";
    private static String string4 = "de f";

    public static void main(String[] args) {
        System.out.println(string1);
        System.out.println(string1.trim());
        System.out.println(string2);
        System.out.println(string2.trim());
        System.out.println(string3);
        System.out.println(string3.trim());
        System.out.println(string4);
        System.out.println(string4.trim());
    }
}
