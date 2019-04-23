package com.jdk8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamTest01 {
    //    使用流对list进行筛选
    public static void main(String[] args) {
        List<Student> list=InitStudent.getStudents();
////        使用以前的方法进行筛选
        List<Student> result=new ArrayList<>();
//        for (Student stu:list
//             ) {
//            if (stu.getScore()>=90){
//                result.add(stu);
//            }
//        }
////        排序,使用lambda
//        result.sort((s1,s2)->Integer.compare(s2.getScore(),s1.getScore()));
//        System.out.println(result);

//        使用stream流来筛选
        result=list.stream()
                .filter(student -> student.getScore()>=90)
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
