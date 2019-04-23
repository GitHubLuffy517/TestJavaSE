package com.io;

import java.io.File;
import java.io.FileInputStream;

public class WordReader {
    //    用字节流读取中文乱码
    public static void main(String[] args) {
      try (  FileInputStream fis=new FileInputStream("src"+ File.separator+"com"+File.separator+"io"+File.separator+"xmm.txt");){
            int len;
            byte[] bytes=new byte[3];
            while ((len=fis.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
            }
      }catch (Exception e){
          e.printStackTrace();
      }

    }
}
