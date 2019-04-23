package com.lxd;

//抽象类
public abstract class demo05 {
    public demo05() {
        System.out.println("Class demo05");
    }

    public abstract void m1();

    public static void main(String[] args) {
//        demo05 de=new demo05();抽象类无法实例化
//        使用多态创建子类实例
        demo05 demo = new B();
        demo.m1();

    }
}

class B extends demo05 {
    @Override
    public void m1() {
        System.out.println("Class B中的m1方法");
    }

    public B() {
//        自动调用父类中的构造方法
        System.out.println("Class B");
    }
}

