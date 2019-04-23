package com.multithreading;

//线程加入
public class ThreadJoin {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("11111111");
                }
            }
        });
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i == 10) {
                        try {
//                            等于把线程合并了
                            thread1.join();

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("2222222");
                }
            }
        };
        thread1.start();
        thread2.start();
    }

}


