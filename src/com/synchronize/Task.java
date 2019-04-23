package com.synchronize;

public class Task {
    private int num=0;
//    线程同享一片内存，会有线程安全问题，实现sychronized关键字会同步
//    会让当前线程操作完成之后再让下一个线程操作
//    高并发最好要在数据类中判断
    public synchronized void changeNum(Boolean b){
        if (b){
            num=88;
            System.out.println(num);
        }else {
            num=66;
            System.out.println(num);
        }
    }
}
