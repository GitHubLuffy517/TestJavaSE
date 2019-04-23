package com.synchronize;

import java.util.Calendar;

public class ThreadDead {
//    发生线程死锁
    public static final Object obj1=new Object();
    public static final Object obj2=new Object();

    public static void main(String[] args) {
        Thread thread1=new Thread(){
            @Override
            public void run() {
               synchronized (obj1){
                   System.out.println("obj1");
                   synchronized (obj2){
                       System.out.println("obj2");
                   }
               }
            }
        };
        Thread thread2=new Thread(){
            @Override
            public void run() {
                synchronized (obj2){
                    System.out.println("obj2");
                    synchronized (obj1){
                        System.out.println(obj1);
                    }
                }
            }
        };
//        两个线程都在等对方释放资源，发生死锁
        thread1.start();
        thread2.start();
    }
}
