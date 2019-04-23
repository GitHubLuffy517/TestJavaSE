package com.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest02 {
    public static void main(String[] args) {
//        流只能使用一次
        List<Student> list=InitStudent.getStudents();
        Stream stream=list.stream();
//        遍历流
        stream.forEach(System.out::println);
//        报错：stream has already been operated upon or closed
//        stream.forEach(System.out::println);
    }
}
