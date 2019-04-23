package com.decorate;

public class SuperNoodle implements NoodleDecorate {
    //    这是一碗超级拉面，对普通拉面进行改造
//    装饰着设计模式，对原来的对象不满意，可以把它传进来，进行改造
    private Noodle noodle;
    public SuperNoodle(Noodle noodle){
        System.out.println("我是一碗超级拉面");
        this.noodle=noodle;
    }
    @Override
    public void addThing() {
        System.out.println("加十斤牛肉");
    }
}
