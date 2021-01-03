package com.happyfire.simplefactory;

/**
 * @Author deng shuo
 * @Date 2021/1/3 09:47
 * @Version 1.0
 */
public class DefalutProduct implements Product {
    @Override
    public void CreateProduct() {
        System.out.println(" no game");
    }
}
