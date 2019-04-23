package com.exception;

public class demo02 {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        int a=10;
        try {
            System.out.println("这是try中的输出");
//            会输出没++的a的值，存在一个临时变量中让其输出
            System.out.println(a);
        } finally {
            a++;
            System.out.println("这是finally中的输出");
        }
    }
}
