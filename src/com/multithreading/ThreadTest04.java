package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//以匿名内部类的方式创建
public class ThreadTest04 {
    public static void main(String[] args) throws Exception {
//        Thread
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        };
        thread1.start();

        //    Runnable
        Runnable runnable=()->{ for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }};
        Thread thread2=new Thread(runnable);
        thread2.start();

//        Callable
//        创建一个线程池
        ExecutorService es = Executors.newCachedThreadPool();
        Future<Integer> f1 = es.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 88;
            }
        });
        System.out.println(f1.get());
    }
}
