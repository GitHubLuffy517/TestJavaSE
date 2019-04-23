package com.collection.shoppingcar;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShoppingCar {
    BigDecimal totalPrice;
    //    初始化购物车
    private Map<Integer, Integer> shoppingMap;

    public ShoppingCar() {
        shoppingMap = new HashMap<>();
        totalPrice= BigDecimal.valueOf(0.0) ;
    }

    public Map<Integer, Integer> getShoppingMap() {
        return shoppingMap;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    //    添加商品至购物车
    public void addCar(Product product, Integer num) {
        Integer id = product.getId();
        if (shoppingMap.containsKey(id)) {
            int befor = shoppingMap.get(id);
            int after = befor + num;
            shoppingMap.put(id, after);
        } else {
            shoppingMap.put(id, num);
        }
        totalPrice = totalPrice.add(product.getPrice().multiply(BigDecimal.valueOf(num)));
    }

    //    从购物车中删除商品
    public void deleteCar(Product product, Integer num) {
        Integer id = product.getId();
        Integer befor = shoppingMap.get(id);
        if (num > befor) {
            shoppingMap.remove(id);
            totalPrice = totalPrice.subtract(product.getPrice().multiply(BigDecimal.valueOf(befor)));
        } else {
            Integer after = befor - num;
            shoppingMap.put(id, after);
            totalPrice = totalPrice.subtract(product.getPrice().multiply(BigDecimal.valueOf(num)));
        }
    }
    @Test
//    打印购物车
    public void printCar() {
        ShoppingCar shoppingCar = new ShoppingCar();
        Product apple = new Product(1001, "苹果", BigDecimal.valueOf(10));
        Product orange = new Product(1002, "橘子", BigDecimal.valueOf(5));
        Product banana = new Product(1003, "香蕉", BigDecimal.valueOf(4));
        shoppingCar.addCar(apple, 5);
        shoppingCar.addCar(orange, 5);
        shoppingCar.addCar(banana, 5);
        shoppingCar.deleteCar(apple,2);
        Set<Integer> keyset = shoppingCar.getShoppingMap().keySet();
        System.out.println(keyset);
        String RMB= DecimalFormat.getCurrencyInstance().format(shoppingCar.getTotalPrice());
        System.out.println(RMB);
    }


}
