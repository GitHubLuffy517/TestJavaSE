package com.multithreading;

public class NotifyTest02 {
    public static void main(String[] args) {
        Print1 p=new Print1();
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
        Thread thread3= new Thread() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    p.print3();
                }
            }
        };
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Print1 {
    private int flag = 1;

    public synchronized void print1() {
        while (flag != 1) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("我是1");
        flag = 2;
        this.notifyAll();
    }

    public synchronized void print2() {
        while (flag != 2) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("我是2");
        flag = 3;
        this.notifyAll();
    }

    public synchronized void print3() {
        while (flag != 3) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("我是3");
        flag = 1;
        this.notifyAll();
    }
}