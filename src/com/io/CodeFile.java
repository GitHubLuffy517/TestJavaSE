package com.io;

import java.io.*;

public class CodeFile {
    //    对读取的文件进行加密
    public static void main(String[] args) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("学校风景.jpg"));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("code.jpg"))
        ) {
            int len;
            while ((len = bufferedInputStream.read()) != -1) {
//                对字节流进行异或运算进行加密
                bufferedOutputStream.write(len ^ 517);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
