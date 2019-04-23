package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderTest {
    //    使用BufferedReader读取内容
    public static void main(String[] args) {
        try (BufferedReader br=new BufferedReader(new FileReader("src" + File.separator + "com" + File.separator + "io" + File.separator + "xh.txt"))){
            String msg;
//            一次读取一行
            while ((msg=br.readLine())!=null){
                System.out.println(msg);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
