package com.string;

public class Test {
//    字符串拼接的性能问题
public static void main(String[] args) {
    String s="test";
    StringBuffer sb=new StringBuffer("test");
//    获取的时间是从1970年1月1日到现在的毫秒数
    long befor=System.currentTimeMillis();
    for (int i=0;i<1000;i++){
        sb.append(i);
    }
    long after=System.currentTimeMillis();
    System.out.println(after-befor);
}
}
