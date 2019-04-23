package com.jdk8.date;

import java.time.LocalDateTime;

public class DateTimeTest {
    //    日期与时间
    public static void main(String[] args) {
//        使用与之前类似
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime.withNano(0));
    }
}
