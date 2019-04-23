package com.reflect.car;
import java.io.FileReader;
import java.util.Properties;

public class CarTest {
    public static void main(String[] args) {
//        使用读取配置文件利用反射来创建对象
//        频繁修改代码，会出现bug
//        配置文件中存储信息以key-value形式存储，用=或者：或者空格隔开
        Properties p=new Properties();
//        使用io流加载属性文件
        try {
            FileReader fr=new FileReader("car.properties");
            p.load(fr);
//            System.out.println(p.getProperty("car"));
            Class class1=Class.forName(p.getProperty("car"));
            Object o=class1.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
