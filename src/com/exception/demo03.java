package com.exception;

import java.util.Scanner;

public class demo03 {
    public static void main(String[] args) {
        try {
            test();
        } catch (DiyException e) {
            e.printStackTrace();
        }
    }
    public static void test() throws DiyException{
        Scanner inn=new Scanner(System.in);
        int a=inn.nextInt();
        if (a<10){
            throw new DiyException("输入的值小于10");
        }
    }
}
