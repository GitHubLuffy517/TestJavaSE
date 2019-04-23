package com.jdk8.date;

import java.time.LocalTime;

public class LocalTimeTest {
    //    获取当前的时间
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        System.out.println(time);
//        指定时间
        LocalTime time1=LocalTime.parse("18:51:22");
        System.out.println(time1);
//        指定时间之后的时间
        LocalTime time2=time.plusHours(1);
//        没有毫秒
        LocalTime time3=time.withNano(0);
        System.out.println(time2);
    }
}
