package com.happyfire.simplefactory;

/**
 * @Author deng shuo
 * @Date 2021/1/3 09:40
 * @Version 1.0
 */
public class TencentProduct implements Product {
    @Override
    public void CreateProduct() {
        System.out.println("Tencent game");
    }
}
