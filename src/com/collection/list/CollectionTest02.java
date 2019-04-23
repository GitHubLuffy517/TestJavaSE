package com.collection.list;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        Person person=new Person("lxd","47");
        c.add(person);
//        要重写Person中的toString方法
        System.out.println(c);
//        要重写equals方法才可以使用contains方法，因为使用的是equals比较内存地址
        Person person2=new Person("lxd","47");
        System.out.println(c.contains(person2));
    }
}
