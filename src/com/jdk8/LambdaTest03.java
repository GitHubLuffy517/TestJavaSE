package com.jdk8;


import java.util.Arrays;
import java.util.Comparator;


public class LambdaTest03 {
    //    方法的引用
    public static void main(String[] args) {
        Integer[] arr = {8, 4, 7, 45, 12, 78};
//        使用两个参数的sort方法
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

//        使用lambda
        Arrays.sort(arr,(x,y)->{return x.compareTo(y);});
//        使用方法引用
        Arrays.sort(arr,Integer::compareTo);
    }
}
