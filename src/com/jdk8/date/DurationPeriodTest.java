package com.jdk8.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DurationPeriodTest {
    //    DurationPeriod
    public static void main(String[] args) {
//        计算日期之差
        LocalDate date1=LocalDate.of(2019,5,17);
        LocalDate date2=LocalDate.now();
        Period period=Period.between(date2,date1);
        System.out.println(period.getDays());

//        计算时间之差
        LocalTime time1=LocalTime.of(21,00,00);
        LocalTime time2=LocalTime.now();
        Duration duration=Duration.between(time1,time2);
        System.out.println(duration.getSeconds());
    }
}
