package com.multithreading;

//继承Thread来实现多线程
//1.定义子类继承Thread
class MyThread extends Thread {
    //2.重写run方法
    @Override
    public void run() {
//        3.将要在线程中执行的代码放在run中
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
//        4.创建自定义线程对象
        MyThread myThread = new MyThread();
//        5.调用start方法执行
        myThread.start();
//        创建两个对象，两个线程交替执行
        MyThread myThread2 = new MyThread();
        myThread2.start();
    }
}
