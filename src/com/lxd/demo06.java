package com.lxd;

public class demo06 {
    //    toString方法
    public static void main(String[] args) {
        Object o = new Object();
//        输出引用类型数据时会自动调用toString方法
        System.out.println(o);
        Person p1=new Person("廖祥栋",18);
//        可以在Person类中重写toString方法
        System.out.println(p1);

    }
}

class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person"+" "+name+" "+id;
    }
}