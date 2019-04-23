package com.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest04 {
    //    File类中的其他方法
    public static void main(String[] args) {
//        查看绝对路径
        File file1=new File("cishu.txt");
        System.out.println(file1.getAbsolutePath());
//        查看文件的大小，单位是字节
        System.out.println(file1.length()+"byte");
//        查看文件的最后修改时间
        long time=file1.lastModified();
        Date date=new Date(time);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
        System.out.println(sdf.format(date));
//        获取目录下同级的文件或者文件夹的名称
        File file2=new File("F:\\JavaSE\\TestJavaSE");
        String[] strArr=file2.list();
        for (String s:strArr
             ) {
            System.out.println(s);
        }
//        获取目录下同级的文件或者文件夹的对象,会调用toString方法输出绝对路径
        File[] files=file2.listFiles();
        for (File file:files
             ) {
            System.out.println(file);
        }
    }
}
