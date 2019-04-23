package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTest {
    //    使用Reader来读取文件，不会乱码，一次读取一个字符
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src" + File.separator + "com" + File.separator + "io" + File.separator + "xh.txt")) {
            int len;
            while ((len=fr.read())!=-1){
                System.out.println((char)len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
