package com.multithreading;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//实现Callable接口创建线程
class MyCallable implements Callable<Integer> {
    int count;
//    创建一个对象时传入一个参数，计算参数的阶乘
    public MyCallable(Integer count) {
        this.count = count;
    }
//    重写call方法
    @Override
    public Integer call() throws Exception {
        int sum = 1;
        if (count != 0) {
            for (int i = 1; i <= count; i++) {
                sum *= i;
            }
            return sum;
        } else {
            return 0;
        }
    }
}

public class ThreadTest03 {
    public static void main(String[] args) throws Exception{
//        创建自定义类对象
        MyCallable myCallable1=new MyCallable(3);
        MyCallable myCallable2=new MyCallable(2);
//        创建线程池，指定线程池内存放线程数量
        ExecutorService es= Executors.newFixedThreadPool(2);
//        创建一个线程池，里面的线程数量会根据任务数量自动添加
//        ExecutorService es=Executors.newCachedThreadPool();
//        将自定义对象放入线程池,会返回一个带泛型的Future类的对象
        Future<Integer> f1=es.submit(myCallable1);
        Future<Integer> f2= es.submit(myCallable2);
//        获取线程的返回结果
//        System.out.println(f1.get());
//        System.out.println(f2.get());
//        判断线程是否执行完毕
        if (f1.isDone()){
            System.out.println(f1.get());
        }else {
            System.out.println("线程1未执行结束");
        }
        if (f2.isDone()){
            System.out.println(f2.get());
        }else {
            System.out.println("线程2未执行结束");
        }
//        关闭线程池,线程未执行结束不会执行
        es.shutdown();
        System.out.println(es.isShutdown());

    }
}
