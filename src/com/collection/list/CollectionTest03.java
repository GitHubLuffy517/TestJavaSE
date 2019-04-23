package com.collection.list;

import java.util.ArrayList;
import java.util.Collection;
//all方法
public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c1=new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");
        c1.add("e");
        c1.add("f");
        Collection c2=new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("c");
        c2.add("d");
        c2.add("e");
        ((ArrayList) c1).addAll(c2);
        System.out.println(c1);
        ((ArrayList) c1).removeAll(c2);
        System.out.println(c1);
        System.out.println(c1.containsAll(c2));
        boolean flag=c1.retainAll(c2);
        System.out.println(flag);
        System.out.println(c1);
    }
}
