package com.jdk8;

public class LambdaTest04 {
    public static void main(String[] args) {
//        使用构造方法引用
        Car car=Car.buy(Car::new);
        System.out.println(car);
    }
}
