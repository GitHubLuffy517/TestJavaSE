package com.string;

public class StringTest01 {
    public static void main(String[] args) {
//        存放在常量池中，String类用final修饰，不可以改变
        String s1="a";
//        存放在堆内存中
        String s2=new String("a");
        System.out.println(s1==s2);
        String s3="a";
//        在常量池中指向的是同一个对象
        System.out.println(s3==s1);
//        创建了两个对象，在堆内存中一个，在常量池中创建一个
        String s4=new String("a");
//        频繁使用字符串拼接操作，会不断在常量池中新建对象， 会占用内存

    }
}
