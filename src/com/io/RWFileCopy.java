package com.io;

import java.io.*;

public class RWFileCopy {
    //   使用字符输入输出的缓冲流来实现文件复制，但是不能拷贝非文本文件
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src" + File.separator + "com" + File.separator + "io" + File.separator + "lxd.txt", true));
             BufferedReader br = new BufferedReader(new FileReader("src" + File.separator + "com" + File.separator + "io" + File.separator + "xh.txt"))
        ) {
            String msg;
            while ((msg = br.readLine()) != null) {
                bw.newLine();
                bw.write(msg);
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
