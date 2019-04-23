package com.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutput {
    //    实现对象的序列化
    public static void main(String[] args) {
        Student student=new Student("张三");
        student.setId(1001);
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("object_zhangsan"))) {
            oos.writeObject(student);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
