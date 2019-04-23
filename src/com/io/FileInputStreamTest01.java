package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis=null;
//        地址多加了个斜杠，是转义字符
//        绝对路径
        String path = "F:\\JavaSE\\TestJavaSE\\src\\com\\io\\lxd.txt";
//        相对路径，是从项目的根目录开始读取
        String path2="src\\com\\io\\lxd.txt";
//        不同系统文件分隔符不同，因此使用File类中的方法来代替分隔符
        String path3="src"+ File.separator+"com"+File.separator+"io"+File.separator+"lxd.txt";
        try {
            fis = new FileInputStream(path3);
//            读取的码值
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());

//            用循环读取，效率慢，一次只读一个字节
//            int len;
//            无参数的read方法返回的是码值，读不到返回-1
//            while ((len=fis.read())!=-1){
//                对码值进行强制转换,输出的就是字母
//                char c=(char) len;
//                System.out.println(c);
//            }

//            用有参的read方法读取，可以传入一个字节数组，一次传输多个
            int len;
//            一次可以读五个字节,如果一次读的字节数小于文本字节数，会在数组中覆盖它，输出abc dbc
//            因此只需要第二次读取的第一个值就可以，利用每次返回的是读取的个数来输出指定个数字节
            byte[] bytes=new byte[3];
//            带参数的read方法返回的是每次读取字节的个数
            while ((len=fis.read(bytes))!=-1){
//                从0开始读，读len个
                System.out.print(new String(bytes,0,len));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
