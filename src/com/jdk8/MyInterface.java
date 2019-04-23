package com.jdk8;
//注解：这是函数式接口
@FunctionalInterface
public interface MyInterface {
//    自定义函数式接口
//    只能有一个抽象方法
//    可以存在非抽象方法
    void m1();
    default void m2(){
        System.out.println("我是m2");
    }
}
