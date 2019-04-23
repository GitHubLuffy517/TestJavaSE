package com.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriterTest {
    //    使用BufferedWriter来写入文件
    public static void main(String[] args) {
        try (BufferedWriter bw=new BufferedWriter(new FileWriter("src" + File.separator + "com" + File.separator + "io" + File.separator + "xh.txt",true))){
            bw.newLine();
            bw.write("你是小漫漫");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
