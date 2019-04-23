package com.multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    //    使用互斥锁唤醒指定的线程
    public static void main(String[] args) {
        Print2 p = new Print2();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    p.print1();
                }
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    p.print2();
                }
            }
        };
        Thread thread3 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    p.print3();
                }
            }
        };
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Print2 {
    private int flag = 1;
    //    互斥锁
    private ReentrantLock r = new ReentrantLock();
    //    监视器
    private Condition c1 = r.newCondition();
    private Condition c2 = r.newCondition();
    private Condition c3 = r.newCondition();

    public void print1() {
        r.lock();
        while (flag != 1) {
            try {
                c1.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("我是1");
        flag = 2;
        r.unlock();
        c2.signal();
    }

    public void print2() {
        r.lock();
        while (flag != 2) {
            try {
                c2.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("我是2");
        flag = 3;
        r.unlock();
        c3.signal();
    }

    public void print3() {
        r.lock();
        while (flag != 3) {
            try {
                c3.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("我是3");
        flag = 1;
        r.unlock();
        c1.signal();
    }
}

