package com.io;

import java.io.*;

public class InOutputStreamRW {
    //    使用InputStreamReader与InputStreamWriter来转换不同字符集的文件内容
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src" + File.separator + "com" + File.separator + "io" + File.separator + "gbk.txt"), "gbk"));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src" + File.separator + "com" + File.separator + "io" + File.separator + "utf_8.txt",true), "utf-8"))
        ) {
                String msg;
                while ((msg=br.readLine())!=null){
                    bw.newLine();
                    bw.write(msg);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
