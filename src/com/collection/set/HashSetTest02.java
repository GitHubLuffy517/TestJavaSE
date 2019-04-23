package com.collection.set;

import com.collection.list.Person;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest02 {
    public static void main(String[] args) {
        Set<Person> set=new HashSet<>();
//        没有重写hashcode方法，依然会存放内容相同的对象
//        HashSet中采用的是用hashcode分类的方式，避免每次都调用equals方法进行if判断
        set.add(new Person("lxd","18"));
        set.add(new Person("lxd","18"));
//        可以在Person类中用idea生成hashcode与equals方法，不用自己手写
        System.out.println(set);
    }
}
