package com.reflect;

public class User {
    public String name;
    private int age;
    protected String address;
    boolean sex;
    public String getName() {
        return name;
    }
    public User(String name){
        System.out.println("调用了有参构造方法");
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public static void main(String[] args) {

    }
    public void Test(String name,int age){
        System.out.println("我叫"+name+"今年"+age);
    }
}
