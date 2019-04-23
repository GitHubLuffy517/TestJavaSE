package com.io;

import java.io.File;
import java.io.FileOutputStream;

public class WordWrite {
    //    用字节流写入中文乱码
    public static void main(String[] args) {
        try (FileOutputStream fos=new FileOutputStream("src"+ File.separator+"com"+File.separator+"io"+File.separator+"xmm.txt",true)){
            fos.write("廖祥栋".getBytes(),0,1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
