package com.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInput {
    public static void main(String[] args) {
//        实现对象的反序列化，对象要实现Serializable接口
        try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object_zhangsan"))){
            Student student=(Student) ois.readObject();
            System.out.println(student.getName());
            System.out.println(student.getId());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
