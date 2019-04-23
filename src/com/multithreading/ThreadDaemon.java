package com.multithreading;

//守护线程
public class ThreadDaemon {
    public static void main(String[] args) {
        Thread thread1=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    System.out.println("守护线程");
                }
            }
        };
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println("被守护");
                }
            }
        });
//        被守护线程结束之后守护线程也会结束
        thread1.setDaemon(true);
        thread1.start();
        thread2.start();
    }
}
