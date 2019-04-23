package com.reflect;

public class Person {
    private String name;
    public Person(){
        System.out.println("Person类对象被创造了");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
