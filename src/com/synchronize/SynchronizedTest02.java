package com.synchronize;

public class SynchronizedTest02 {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        Thread thread1=new Thread(ticket);
        Thread thread2=new Thread(ticket);
        Thread thread3=new Thread(ticket);
        thread1.setName("淘票票");
        thread2.setName("猫眼");
        thread3.setName("糯米");
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
