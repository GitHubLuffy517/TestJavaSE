package com.io;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        String readPath="src"+ File.separator+"com"+File.separator+"io"+File.separator+"xh.txt";
        String writePath="src"+ File.separator+"com"+File.separator+"io"+File.separator+"xmm.txt";
        try {
//            定义读入与写出的路径
            fis=new FileInputStream(readPath);
            fos=new FileOutputStream(writePath);
            byte[] bytes=new byte[5];
            int len;
//            读取文件内容后写入新文件中
            while ((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
