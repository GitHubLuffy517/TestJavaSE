package com.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class ListTest02 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("a");
        c.add("lxd");
        c.add("xh");
//        使用Iterator遍历集合再add元素会报错,使list中的元素发生变化
//        Iterator iterator=c.iterator();
//        while (iterator.hasNext()){
//            String s=(String) iterator.next();
//            if ("lxd".equals(s)){
//                c.add("xmm");
//            }
//        }
//        可以使用listiterator来添加元素使得添加成功
        ListIterator listIterator=((ArrayList) c).listIterator();
        while (listIterator.hasNext()){
            String s=(String)listIterator.next();
            if ("xh".equals(s)){
                listIterator.add("xmm");
            }
        }
        System.out.println(c);
    }
}
