package com.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
//        不常用,线程安全
        Vector v=new Vector();
        v.add("a");
        v.add("b");
        Enumeration enumeration=v.elements();
        while (enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement()+" ");
        }
    }
}
