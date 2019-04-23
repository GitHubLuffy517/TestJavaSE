package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class demo01 {
    public static void main(String[] args) {
//        方法将错误一层一层抛出，调用方法的方法可以处理也可以抛出，最后由JVM处理
        try {
            m1();
//            一个catch语句中可以写多个异常，中间用|隔开
        } catch (FileNotFoundException | NullPointerException e) {
            System.out.println("找不到指定文件");
        }
    }

    public static void m1() throws FileNotFoundException {
        m2();
    }

    public static void m2() throws FileNotFoundException {
        m3();
    }

    public static void m3() throws FileNotFoundException {
        m4();
    }

    public static void m4() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D:/lxd");
    }
}
