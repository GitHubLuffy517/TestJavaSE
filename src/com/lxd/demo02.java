package com.lxd;
//运算符
public class demo02 {
    public static void main(String[] args) {
//        先执行赋值
        int i=5;
        int j=i++;
        System.out.println(j);
//        先执行++
        int k=++i;
        System.out.println(k);

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
    }
}
