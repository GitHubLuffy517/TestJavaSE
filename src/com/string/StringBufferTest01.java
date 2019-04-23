package com.string;

public class StringBufferTest01 {
//    StringBuffer底层是一个char数组，线程安全但是性能略差
    public static void main(String[] args) {
//        StringBuffer的三个构造方法
        StringBuffer sb1=new StringBuffer();
//        默认长度为16
        System.out.println(sb1.capacity());
        StringBuffer sb2=new StringBuffer(100);
//        指定长度为100
        System.out.println(sb2.capacity());
        StringBuffer sb3=new StringBuffer("lxd");
//        会使长度为16+字符串的长度，并且把字符串append至StringBuffer对象中
        System.out.println(sb3.capacity());
//        自动调用toString方法
        System.out.println(sb3);
//        StringBuffer的增加与删除
        System.out.println(sb3.append("xd"));
//        删除指定位置
        System.out.println(sb3.delete(0,3));
    }
}
