package com.multithreading;

public class NotifyTest01 {
    //    交替输出两个线程的内容
    public static void main(String[] args) {
        Print p=new Print();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    p.print1();
                }
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                  p.print2();
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}

class Print {
    private int flag=1;
    public synchronized void print1(){
        if (flag!=1){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("我是1");
        flag=2;
        this.notify();
    }
    public synchronized void print2(){
        if (flag!=2){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("我是2");
        flag=1;
        this.notify();
    }
}
