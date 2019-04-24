package com.file;
import java.io.File;
import java.util.Scanner;

/*
 * 实现一个遍历一个文件夹下面所有的文件的功能，并实现缩进
 * 1.判断用户输入的文件夹是否存在
 * 2.判断是否是一个文件
 * 3.如果是文件夹返回一个File对象
 * 4.获取File对象的listFiles，遍历数组，输出第一级目录
 * 5.对每一个File进行判断是否是文件夹，如果是，递归调用自己
 * 6.每调用一次增加一次count计数，缩进，每一个数组遍历结束，count减少一次，减少缩进
 * */
public class Demo {
    private static int count = 0;

    public static void main(String[] args) {
        getFileNames(getFile());
    }

    public static File getFile() {
        while (true) {
            Scanner inn = new Scanner(System.in);
            System.out.println("请输入路径：");
            String filepath = inn.next();
            File file = new File(filepath);
            if (!file.exists()) {
                System.out.println("请输入正确的路径");
            } else if (file.isFile()) {
                System.out.println("您输入的是文件！请输入文件夹");
            } else {
                return file;
            }
        }
    }

    public static void getFileNames(File file) {
//        每调用一次方法，让count++，每一个数组遍历输出结束，让count--
        count++;
        File[] filelist = file.listFiles();
        for (int i = 0; i < filelist.length; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print("  ");
            }
            System.out.println(filelist[i]);
            if (filelist[i].isDirectory()) {
                getFileNames(filelist[i]);
            }
            if (i == filelist.length - 1) {
                count--;
            }
        }
    }

}
