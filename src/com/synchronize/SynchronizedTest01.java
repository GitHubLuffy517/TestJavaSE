package com.synchronize;

public class SynchronizedTest01 {
    //    测试线程同步
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                task.changeNum(true);
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                task.changeNum(false);
            }
        };
        thread1.start();
        thread2.start();
    }
}
