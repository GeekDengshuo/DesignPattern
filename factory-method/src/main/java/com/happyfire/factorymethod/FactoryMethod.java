package com.happyfire.factorymethod;

/**
 * @Author deng shuo
 * @Date 2021/1/3 14:07
 * @Version 1.0
 */
public interface FactoryMethod {

    Product manufacture(ProductEnum productEnum);
}
