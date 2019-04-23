package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        String path="src"+ File.separator+"com"+File.separator+"io"+File.separator+"xh.txt";
        try {
//            加参数true不会覆盖之前的内容
            fos=new FileOutputStream(path,true);
//            写入换行
            fos.write("\n".getBytes());
            String str="Hello word";
            fos.write(str.getBytes());
//            刷新
            fos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
