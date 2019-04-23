package com.multithreading;
//让线程睡眠
public class ThreadTest05 {
    public static void main(String[] args) throws Exception{
//        for (int i=0;i<10;i++){
////            让当前线程也就是主线程休息一秒再执行
//            Thread.sleep(1000);
//            System.out.println(i);
//        }
//        自定义线程让其休息
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("我是线程一");
                }
            }
        }).start();

        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("我是线程二");
                }
            }
        }.start();
    }
}
