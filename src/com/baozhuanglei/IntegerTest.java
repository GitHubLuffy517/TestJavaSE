package com.baozhuanglei;

public class IntegerTest {
    public static void main(String[] args) {
//        转为二进制，八进制，十六进制
        String s1=Integer.toBinaryString(78);
        System.out.println(s1);
        String s2=Integer.toOctalString(78);
        System.out.println(s2);
        String s3=Integer.toHexString(78);
        System.out.println(s3);
    }
}
