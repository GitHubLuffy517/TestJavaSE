package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DecodeFile {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("code.jpg"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("decode.jpg"))
        ) {
            int len;
            while ((len=bis.read())!=-1){
//                解密，两次异或运算回到初始值
                bos.write(len^517);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
