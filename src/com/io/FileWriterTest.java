package com.io;

import java.io.File;
import java.io.FileWriter;

public class FileWriterTest {
    //    使用字符流writer来写入文件
    public static void main(String[] args) {
      try (  FileWriter fw=new FileWriter("src" + File.separator + "com" + File.separator + "io" + File.separator + "xh.txt",true)){
          String msg="我是小漫漫";
          fw.write("\n");
          fw.write(msg);
      }catch (Exception e){
          e.printStackTrace();
      }
    }
}
