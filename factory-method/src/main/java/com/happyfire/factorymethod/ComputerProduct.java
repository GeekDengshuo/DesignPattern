package com.happyfire.factorymethod;



/**
 * @Author deng shuo
 * @Date 2021/1/3 14:18
 * @Version 1.0
 */
public class ComputerProduct implements Product {

    private final ProductEnum productEnum;
    public ComputerProduct(ProductEnum productEnum){
        this.productEnum = productEnum;
    }
    @Override
    public ProductEnum getProduct() {
        return productEnum;
    }

    @Override
    public String toString() {
        return "Computer"+productEnum;
    }
}
