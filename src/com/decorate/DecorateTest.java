package com.decorate;

public class DecorateTest {
    //    创建一个超级牛肉拉面
    public static void main(String[] args) {
        SuperNoodle superNoodle=new SuperNoodle(new Noodle());
        superNoodle.addThing();
    }
}
