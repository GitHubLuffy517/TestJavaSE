package com.string;

public class StringTest03 {
    public static void main(String[] args) {
//        统计小字符串在大字符串中出现的次数
        String s1 = "I am lxd,I love xh,you know xh?";
        String s2 = "xh";
        int count = 0;
        int index = 0;
        while ((index = s1.indexOf(s2)) != -1) {
            count++;
//            截取小字符串后面的字符串
            s1 = s1.substring(index + s2.length());
        }
        System.out.println(count);

//    倒置输出字符串
        String s3 = "lxdxh";
        for (int i = s3.length() - 1; i >= 0; i--) {
            System.out.print(s3.toCharArray()[i]);
        }
        System.out.println();
//       大写字母出现的次数
        String s4 = "LXDxdxhXh";
        int count2 = 0;
        char[] arrc = s4.toCharArray();
        for (char c : arrc
        ) {
            if (c >= 'A' && c <= 'Z') {
                count2++;
            }
        }
        System.out.println(count2);
    }


}
