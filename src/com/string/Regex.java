package com.string;

public class Regex {
//    正则表达式
    public static void main(String[] args) {
        String s="aaa124";
        System.out.println(s.replaceAll("\\d","中"));
//        匹配邮箱
        String email="lxdong517@163.com";
        System.out.println(email.matches("\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+.)+[A-Za-z]{2,14}"));
//        匹配手机号
        String phoneNumber="17355439060";
        System.out.println(phoneNumber.matches("0?(13|14|15|18|17|19)[0-9]{9}"));
    }
}
