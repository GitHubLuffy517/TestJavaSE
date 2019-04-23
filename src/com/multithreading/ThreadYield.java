package com.multithreading;

//线程的礼让
public class ThreadYield {
    public static void main(String[] args) {
        Thread thread1=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    System.out.println("我是领导");
                }
            }
        };
        Thread thread2=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    if (i%2==0){
//                        礼让
                        Thread.yield();
                    }
                    System.out.println("我是员工");
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}
