package com.reflect;

public class ReflectTest01 {
    public static void main(String[] args) throws ClassNotFoundException{
//        三种方式获取class对象
        Class class1=Class.forName("com.reflect.Person");

        Class class2=Person.class;

        Person p=new Person();
        Class class3=p.getClass();

//        三种方式获取到的class对象为同一个class对象
        System.out.println(class1==class2);
        System.out.println(class1==class3);
    }
}
