package com.bean;

public class Animal {
    String name="动物";
    String color;
    String age;
    public Animal(){
        System.out.println("Animal的无参构造方法");
    }
    public Animal(String color,String age){
        this.color=color;
        this.age=age;
    }
    public void eat(){
        System.out.println("动物吃饭");
    }
}
