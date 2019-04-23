package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<Person> list=new ArrayList();
        list.add(new Person("lxd","47"));
        List<Student> list1=new ArrayList<>();
        list1.add(new Student());
        System.out.println(list1);
//        可以将子类泛型的list存放到父类泛型的list中
        list.addAll(list1);
        System.out.println(list);
    }
}
