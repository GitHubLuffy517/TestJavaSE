package com.reflect;

import java.util.Date;

//使用反射来创建类的对象
public class ReflectTest02 {
    public static void main(String[] args) throws ClassNotFoundException,InstantiationException,IllegalAccessException{
        Class class1=Class.forName("com.reflect.Person");
        Object o=class1.newInstance();
        System.out.println(o);
//        使用反射来创建java自带的类
        Class class2=Class.forName("java.util.Date");
        System.out.println(class2.newInstance());
    }
}
