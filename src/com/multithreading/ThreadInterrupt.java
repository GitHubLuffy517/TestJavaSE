package com.multithreading;

//打断正在睡眠的线程
public class ThreadInterrupt {
    public static void main(String[] args) {
        Thread thread=new Thread(){
            @Override
            public void run() {
                //        让其睡眠
                try {
                    Thread.sleep(10000000000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我醒了");
            }
        };
        thread.start();
        thread.interrupt();
    }
}
