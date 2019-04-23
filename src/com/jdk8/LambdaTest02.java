package com.jdk8;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest02 {
    //    使用lambda来遍历集合
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
//        普通遍历方式
        for (Integer i : list
        ) {
            System.out.print(i + " ");
        }
//        使用lambda来遍历,当只有一个参数时，i的小括号可以去掉
        list.forEach(i -> System.out.print(i + " "));
//        只有一条语句时可以使用方法引用
        list.forEach(System.out::println);
    }
}
