package com.jdk8.stream;

import java.util.ArrayList;
import java.util.List;

public class InitStudent {
    public static List<Student> getStudents(){
        List<Student> list=new ArrayList<>();
        list.add(new Student("张三",89));
        list.add(new Student("李四",90));
        list.add(new Student("王二",95));
        list.add(new Student("赵六",98));
        list.add(new Student("路飞",100));
        list.add(new Student("索隆",99));
        list.add(new Student("乔巴",88));
        list.add(new Student("乌索普",70));
        list.add(new Student("山治",90));
        return list;
    }
}
