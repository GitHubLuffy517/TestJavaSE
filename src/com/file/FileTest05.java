package com.file;

import java.io.File;

public class FileTest05 {
    //    同级目录下以txt文件的数量
    public static void main(String[] args) {
        //getTxtOld();
        getTxtNew();
    }

    public static void getTxtNew() {
        File file = new File("F:\\JavaSE\\TestJavaSE");
        File[] filelist = file.listFiles();
        int count = 0;
        for (File file1 : filelist
        ) {
            String filename=file1.toString();
            if (filename.endsWith(".txt")) {
//                判断是否是文件
                if (file1.isFile()){
                    count++;
                    System.out.println(filename);
                }
            }
        }
        System.out.println(count);
    }

    //    废弃的方法，会将名称以.txt结尾的文件夹也传进来
    @Deprecated
    public static void getTxtOld() {
        File file = new File("F:\\JavaSE\\TestJavaSE");
        String[] list = file.list();
        int count = 0;
        for (String s : list
        ) {
            if (s.endsWith(".txt")) {
                count++;
                System.out.println(s);
            }
        }
        System.out.println(count);
    }

}
