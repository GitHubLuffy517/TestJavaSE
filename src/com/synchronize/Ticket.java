package com.synchronize;

public class Ticket implements Runnable {
    private int count = 100;
    //    高并发最好要在数据类中判断
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (count <= 0) {
                    break;
                }
                count--;
                System.out.println(Thread.currentThread().getName() + "卖出了一张  还剩" + count + "张");
            }
        }
    }


}
