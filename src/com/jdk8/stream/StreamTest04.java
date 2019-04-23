package com.jdk8.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
//        创建流
//        使用Stream.of
        String[] str={"l","x","d","l","o","v","e","x","h"};
        Stream.of(str).map(String::toUpperCase)
                .forEach(System.out::println);

//        使用Arrays.stream
        int[] counts={8,4,1,5,4,4};
        long sum=Arrays.stream(counts).sum();
        System.out.println(sum);

//        使用函数表达式创建无限流
        Stream.iterate(0,n->n+2)
                .limit(10)//取前十个
                .forEach(System.out::print);
    }
}
