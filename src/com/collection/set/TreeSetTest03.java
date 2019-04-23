package com.collection.set;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTest03 {
    //    按照字典的顺序输出一个英文字符串
    public static void main(String[] args) {
        Scanner inn=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str=inn.next();
        char[] chars=str.toCharArray();
//        重写匿名内部类中的compare方法，让他们比较ASCII码
        TreeSet<Character> treeSet=new TreeSet(new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                int num=c1.compareTo(c2);
                return num==0?1:num;
            }
        });
        for (Character c:chars
             ) {
            treeSet.add(c);
        }
        for (Character c:treeSet
             ) {
            System.out.print(c);
        }
    }
}
