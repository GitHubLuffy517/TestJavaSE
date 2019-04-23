package com.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) throws Exception {
        System.out.println(getDayOfWeek("2019-4-16"));
        System.out.println(getDayOfLife("2019-4-1"));
    }
    public static int getDayOfWeek(String d) throws Exception{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(d);
        Calendar c=Calendar.getInstance();
//        将Calendar对象c设置为date的值
        c.setTime(date);
//        从周末开始算
        return c.get(Calendar.DAY_OF_WEEK)-1;
    }
    public static long getDayOfLife(String birth) throws Exception{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(birth);
        Calendar c=Calendar.getInstance();
        c.setTime(date);
        long birthday=c.getTimeInMillis();
        long now=System.currentTimeMillis();
        return ((now-birthday)/1000/60/60/24);
    }

}
