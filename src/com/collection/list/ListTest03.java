package com.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class ListTest03 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("a");
        c.add("lxd");
        c.add("xh");
        ListIterator listIterator=((ArrayList) c).listIterator();
//        没有输出因为指针在第一个元素，没有前置元素，要先正序输出使得指针在最后一个元素上
//        让指针移到最后一个元素
        while (listIterator.hasNext()){
            listIterator.next();
        }
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }
    }
}
