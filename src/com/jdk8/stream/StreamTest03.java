package com.jdk8.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest03 {
    //    获取map-reduce
    public static void main(String[] args) {
        List<Student> list = InitStudent.getStudents();
//        获取分数的list
        List<Integer> scoreList = list.stream()
                .map(Student::getScore)
                .collect(Collectors.toList());
        System.out.println(scoreList);
//        获取姓名的长度，返回list
        List<Integer> nameList = list.stream()
                .map(Student::getName)
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(nameList);

//        使用reduce进行计算总分
        int count = list.stream()
                .map(Student::getScore)
                .reduce(0, (a, b) -> a + b);//两个参数的
        System.out.println(count);

//        一个参数，返回一个Optional类的对象
        Optional<Integer> count1 = list.stream()
                .map(Student::getScore)
                .reduce((a, b) -> a + b);
        System.out.println(count1);

//        使用reduce取得最大最小值
        Optional<Integer> max = list.stream()
                .map(Student::getScore)
                .reduce(Integer::max);
        System.out.println(max);
        System.out.println(max.get());
        Optional<Integer> min = list.stream()
                .map(Student::getScore)
                .reduce(Integer::min);
        System.out.println(min);
    }
}
