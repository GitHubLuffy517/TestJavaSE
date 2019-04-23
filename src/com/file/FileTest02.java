package com.file;

import java.io.File;

public class FileTest02 {
    //    File的对文件删除重命名功能，删除方法不会放到回收站，直接删除，返回一个布尔类型值
    public static void main(String[] args) {
//        在同一文件夹下的重命名
        File file1=new File("D:\\filetest.txt");
        File file2=new File("D:\\newfile.txt");
        file1.renameTo(file2);
//        在不同文件夹下的重命名,剪切过去再重命名
        File file3=new File("D:\\newfile.txt");
        File file4=new File("D:\\filetest\\file.txt");
        file3.renameTo(file4);
//        删除文件
        File file5=new File("D:\\filetest\\file.txt");
        file5.delete();
//        删除文件夹,只有在文件夹没有子文件夹时才可以删除成功
        File file6=new File("D:\\filetest");
        file6.delete();
    }
}
