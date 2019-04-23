package com.jdk8.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {
    public static void main(String[] args) {
//        获得当前日期，没有时间
        LocalDate date1=LocalDate.now();
        System.out.println(date1);
//        获取当前日期的年月日
        int year=date1.getYear();
        int month=date1.getMonthValue();
        int day=date1.getDayOfMonth();
        System.out.println(year+""+month+""+day);
//        格式化日期
        LocalDate date2=LocalDate.now();
        String formatdate=date2.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日"));
        System.out.println(formatdate);
//        是否是闰年
        System.out.println(date2.isLeapYear());
//        当前月份的天数
        int days=date2.lengthOfMonth();
        System.out.println(days);
//        自定义日期
//        方式一,月份前加0
        LocalDate date3=LocalDate.parse("2018-05-17");
//        方式二
        LocalDate date4=LocalDate.of(2018,5,17);
//        判断日期是否相等
        System.out.println(date3.equals(date4));
//        获取一周后的日期,多个方法，包含年月日周
        LocalDate date5=date1.plusWeeks(1);
        LocalDate date6=date1.plus(1,ChronoUnit.YEARS);
        System.out.println(date5);
        System.out.println(date6);
    }
}
