package com.multithreading;

//设置线程优先级
public class ThreadPriority {
    public static void main(String[] args) {
//        新建两个线程
        Thread thread1=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    System.out.println("111111111");
                }
            }
        };
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    System.out.println("22222222");
                }
            }
        });
//        优先级越高不代表优先执行，只是占用的资源多，性能好
        thread1.setPriority(3);
        thread2.setPriority(3);

        thread1.start();
        thread2.start();
    }
}
