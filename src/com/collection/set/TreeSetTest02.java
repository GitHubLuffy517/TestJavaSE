package com.collection.set;

import com.collection.list.Person;

import java.util.TreeSet;

public class TreeSetTest02 {
    //    在存放自定义数据时，treeSet要进行排序，因此根据compareto方法判断大小
    public static void main(String[] args) {
        TreeSet<Person> treeSet=new TreeSet();
//        会抛出异常，无法比较大小：com.collection.list.Person cannot be cast to java.lang.Comparable
        treeSet.add(new Person("lxd","47"));
        treeSet.add(new Person("xh","48"));
//        无法将下面这个对象存入treeSet，因为比较的是姓名，一致的话就返回0，不存入
//        但是在除了set的其他集合中就可以，因为可以重复
        treeSet.add(new Person("xh","45"));
        treeSet.add(new Person("amm","49"));
        System.out.println(treeSet);
    }

}
