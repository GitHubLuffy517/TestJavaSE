package com.bean;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {
    String name = "狗";

    //使用super（）调用父类的属性与方法
    public void eat() {
        super.eat();
        System.out.println("狗吃狗粮");
        System.out.println(super.name);
        System.out.println(this.name);
    }

    //使用super（）调用父类的构造方法
    public Dog() {
//        不调用会自动调用父类中的无参构造方法
        super("黑色", "18");
        System.out.println("Dog中的无参构造方法");
    }

    public void move() {
        System.out.println("狗在走路");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        System.out.println(dog.name);
        System.out.println(dog.color);
        System.out.println(dog.age);
        Animal a1 = new Dog();//父类引用指向子类对象，向上转型
//        成员变量无法重写
        System.out.println(a1.name);
//        成员方法可以重写
        a1.eat();
        ((Dog) a1).move();//向下转型，不转会报错，Animal中没有move方法

//        instanceof方法
        if (dog instanceof Animal){
            System.out.println("是该类型");
        }else {
            System.out.println("不是该类型");
        }
    }
}
