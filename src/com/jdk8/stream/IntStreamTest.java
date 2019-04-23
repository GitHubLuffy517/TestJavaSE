package com.jdk8.stream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class IntStreamTest {
    //   IntStreamTest,DoubleStream,LongStream
    public static void main(String[] args) {
        List<Student> list=InitStudent.getStudents();
//        直接获取总分
        int sum=list.stream()
                .mapToInt(Student::getScore)
                .sum();
        System.out.println(sum);
//        获取平均分
        OptionalDouble avg=list.stream()
                .mapToInt(Student::getScore)
                .average();
        System.out.println(avg);
//        获取1-100之间的偶数个数包含100
        long count=IntStream.rangeClosed(1,100)
                .filter(i->i%2==0)
                .count();
        System.out.println(count);
    }
}
