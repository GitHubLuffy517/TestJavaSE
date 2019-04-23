package com.io;

import org.junit.Test;

import java.io.*;

public class IOTest {
    /*
     * 写一个用户试用次数的功能
     * 每个用户试用次数为3次，通过输出流加密输出到硬盘的文件中
     * 每次加载主方法调用输入流，对数据解密，判断是否还有机会，并自减运算，再加密存入文件中
     * 每次加载主程序显示还有几次试用机会
     *
     * */

    public static void code() {
//        创建文件，并写入加密内容
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("cishu.txt"))) {
            bos.write(3 ^ 66);
            bos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    对文件进行解密并将次数自减返回
    public static void decode() {
        BufferedOutputStream bos=null;
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("cishu.txt"))
        ) {
            int temp = bis.read();
            int count = temp ^ 66;
            if (count>0&&count<=3){
                count--;
                System.out.println("你还有" + count + "次机会");
//                当没有机会时运行不到这一步，因此需要在关闭时判断是否为空
                bos=new BufferedOutputStream(new FileOutputStream("cishu.txt"));
                bos.write(count^66);
            }else {
                System.out.println("你已经没有机会！");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (bos!=null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {

        //code();
        decode();

    }
}
