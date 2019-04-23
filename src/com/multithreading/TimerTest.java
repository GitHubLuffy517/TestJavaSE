package com.multithreading;

import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) throws Exception{
        Timer timer=new Timer();
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                System.out.println("你好");
            }
        };
//        三秒之后输出你好
//        timer.schedule(timerTask,3000);
//        另一个方法,什么时候开始，多久执行一次
        timer.schedule(timerTask, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2019-4-20 19:51:00 000"),2000);
    }
}
