package com.bigdecimal;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BigDecimalTest {
    public static void main(String[] args) {
//        会损失精度，银行类项目要求精度高
        System.out.println(2.0-1.1);
        BigDecimal bd1=new BigDecimal("2.0");
        BigDecimal bd2=new BigDecimal("1.1");
        System.out.println(bd1.subtract(bd2));

//        Decimal格式化
        String RMB= DecimalFormat.getCurrencyInstance().format(1600000);
        System.out.println(RMB);
//        自定义格式
//        改为万分位
        DecimalFormat df1=new DecimalFormat("####,####");
        System.out.println(df1.format(1600000));
//        加入小数,只保留两位
        DecimalFormat df2=new DecimalFormat("###,###.##");
        System.out.println(df2.format(1600000.22222));
//        保留四位，不够补0
        DecimalFormat df3=new DecimalFormat("###,###.0000");
        System.out.println(df3.format(1600000.22));
    }
}
