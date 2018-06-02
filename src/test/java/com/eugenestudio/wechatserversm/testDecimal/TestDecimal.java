package com.eugenestudio.wechatserversm.testDecimal;

import java.text.DecimalFormat;

public class TestDecimal {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println(decimalFormat.format(Double.parseDouble("12.456")));
        System.out.println(decimalFormat.format(Double.parseDouble("0.454")));
        System.out.println(new DecimalFormat("0.##").format(0.134));
    }
}
