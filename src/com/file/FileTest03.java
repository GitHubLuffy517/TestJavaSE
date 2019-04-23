package com.file;

import java.io.File;

public class FileTest03 {
    //    File类中一些常用的判断方法
    public static void main(String[] args) {
//        判断是不是文件
        File file1=new File("D:\\new.txt");
        System.out.println(file1.isFile());
//        判断是不是文件夹
        File file2=new File("D:\\filetest");
        System.out.println(file2.isDirectory());
//        判断文件是否存在
        System.out.println(file1.exists());
//        判断文件是否隐藏
        File file3=new File("D:\\hidden");
        System.out.println(file3.isHidden());
    }
}
