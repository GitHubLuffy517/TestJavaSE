package com.io;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -7272779132855024377L;
//    生成版本id，当对象更新时，反序列化不会报错

    private String name;
//    transient关键字可以使其不被序列化
    transient private int id;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
