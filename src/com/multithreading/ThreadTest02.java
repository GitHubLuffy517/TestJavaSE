package com.multithreading;

//使用实现Runnable接口来创建线程
//1.创建类实现接口
class MyRunnable implements Runnable {
    //    2.重写run方法
    @Override
    public void run() {
//        3.run中要执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) {
        //    4.创建一个自定义的类
        MyRunnable myRunnable = new MyRunnable();
        //    5.创建一个Thread对象，把自定义对象作为参数传入构造方法
        Thread thread1 = new Thread(myRunnable);
        thread1.start();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }


}
