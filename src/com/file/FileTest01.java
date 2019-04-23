package com.file;

import java.io.File;

public class FileTest01 {
    //    File类的各种方法
    public static void main(String[] args) throws Exception{
//        指定盘符创建新文件，返回一个布尔类型，如果不存再就返回true，存在就返回false
        File file1=new File("D:\\filetest.txt");
        System.out.println(file1.createNewFile());
//        创建文件夹,单级目录，返回值同上，只能创建文件夹
        File file2=new File("D:\\filetest");
        System.out.println(file2.mkdir());
//        创建多级目录
        File file3=new File("D:\\filetest02\\filetest");
        System.out.println(file3.mkdirs());
//        相对路径创建文件夹，默认在项目的根目录
        File file4=new File("filetest");
        System.out.println(file4.mkdir());
//        相对路径创建文件
        File file5=new File("filetest.txt");
        System.out.println(file5.createNewFile());
    }
}
