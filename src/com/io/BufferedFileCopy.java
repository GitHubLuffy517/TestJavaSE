package com.io;

import java.io.*;

public class BufferedFileCopy {
    //    使用文件输入输出流来复制文件
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("src" + File.separator + "com" + File.separator + "io" + File.separator + "xh.txt"));
            bos = new BufferedOutputStream(new FileOutputStream("src" + File.separator + "com" + File.separator + "io" + File.separator + "xmm.txt"));
            int len;
            while ((len = bis.read()) != -1) {
                bos.write(len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
