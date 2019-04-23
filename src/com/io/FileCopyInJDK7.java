package com.io;

import java.io.*;

public class FileCopyInJDK7 {
    //    JDK7后新加入的接口实现的方法，自动关闭输入输出流
    public static void main(String[] args) {
        try (BufferedInputStream  bis = new BufferedInputStream(new FileInputStream("src" + File.separator + "com" + File.separator + "io" + File.separator + "xh.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src" + File.separator + "com" + File.separator + "io" + File.separator + "xmm.txt"))
       ;//           验证是否调用了相关方法
             //           验证是否调用了相关方法
             TestClose testClose=new TestClose();
        )
        {
            int len;
            while ((len = bis.read()) != -1) {
                bos.write(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static class TestClose implements AutoCloseable{
        @Override
        public void close() throws Exception {
            System.out.println("关闭了");
        }
    }
}

