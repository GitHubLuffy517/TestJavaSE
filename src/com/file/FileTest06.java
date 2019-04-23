package com.file;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest06 {
    //    使用文件过滤器来过滤以.txt结尾的文件
    public static void main(String[] args) {
//        获取目录
        File file1=new File("F:\\JavaSE\\TestJavaSE");
//        调用带参数的list方法，传入一个过滤对象，以匿名内部类的形式
//        带参数的list方法是先获得所有的文件名，用过滤器的筛选条件过滤，符合条件才把它添加到数组中返回
        String[] list=file1.list(new FilenameFilter() {
//            重写过滤方法
            @Override
            public boolean accept(File dir, String name) {
//                用一个File对象来接受传进来的文件,另一个构造函数
                File file2=new File(dir,name);
                return file2.isFile()&&file2.getName().endsWith(".txt");
            }
        });
        System.out.println("个数为："+list.length);
        for (String s:list){
            System.out.println(s);
        }
    }
}
