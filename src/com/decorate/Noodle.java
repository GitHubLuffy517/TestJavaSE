package com.decorate;

public class Noodle implements NoodleDecorate{
    //    拉面类
//    实现往拉面里面加料的接口
//一碗普通拉面
    public Noodle(){
        System.out.println("我是一碗拉面");
    }
    @Override
    public void addThing() {
        System.out.println("加牛肉");
        System.out.println("加葱花");
        System.out.println("加白萝卜");
    }
}
