package com.multithreading;

public class ThreadObject {
    //    获取线程的对象
    public static void main(String[] args) {
//        获取主线程对象的名字
        System.out.println(Thread.currentThread().getName());
//        获取自定义线程的名称，这个构造方法传两个值，一个对象，一个线程名
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        },"自定义的线程").start();
    }
}
