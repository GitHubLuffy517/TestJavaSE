package com.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add(  new Person("lxd","47"));
        c.add( new Person("xh","47"));
        c.add(new Person("xmm","47"));
        c.add( new Person("bb","47"));
        iteratorWhile(c);
        iteratorFor(c);
    }
    public static void iteratorWhile(Collection c){
//        采用多态的方式建立iterator对象
        Iterator iterator=c.iterator();
        System.out.println("使用while循环来输出");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void iteratorFor(Collection c){
        System.out.println("使用for循环来输出：");
        for (Iterator iterator=c.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
