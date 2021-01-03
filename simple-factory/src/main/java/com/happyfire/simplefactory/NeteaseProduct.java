package com.happyfire.simplefactory;

/**
 * @Author deng shuo
 * @Date 2021/1/3 09:41
 * @Version 1.0
 */
public class NeteaseProduct implements Product{
    @Override
    public void CreateProduct() {
        System.out.println("Netease game");
    }
}
