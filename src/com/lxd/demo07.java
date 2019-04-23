package com.lxd;

public class demo07 {
    public static void main(String[] args) {
        User u1 = new User("马云", "55");
        User u2 = new User("马云", "55");
        //引用类型比较的是内存地址，可以重写equals方法,String类型的equals方法重写过了
        System.out.println(u1.equals(u2));
        //System.out.println(u3.equals(u2));
    }
}

class User {
    String name;
    String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof User) {
            User user = (User) obj;
            if (this.name.equals(user.name) && this.id.equals(user.id)) {
                return true;
            }
        }
        return false;
    }
}