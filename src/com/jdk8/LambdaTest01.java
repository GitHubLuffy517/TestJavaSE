package com.jdk8;

public class LambdaTest01 {
    public static void main(String[] args) {
//        使用匿名内部类创建接口对象
        MyInterface myInterface1 = new MyInterface() {
            @Override
            public void m1() {
                System.out.println("我是m1");
            }
        };
        myInterface1.m1();
        myInterface1.m2();
//        使用lambda来创建接口对象
        MyInterface myInterface2 = () -> {
            System.out.println("我是lambda的m1");
        };
        myInterface2.m1();
//        带有return的抽象方法可以写成如下方式
//        MyInterface myInterface2=()->a+b;
    }
}
