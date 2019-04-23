package com.bean;

public class User {
    private String name;
    private String id;
    public User() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    //    重写finalize方法

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize 方法已调用");
    }
}
