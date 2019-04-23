package com.jdk8;

import java.util.function.Supplier;

public class Car {
    public static Car buy(Supplier<Car> c){
        return c.get();
    }
}
