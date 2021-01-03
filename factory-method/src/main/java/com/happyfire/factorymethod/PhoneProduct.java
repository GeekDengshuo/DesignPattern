package com.happyfire.factorymethod;

/**
 * @Author deng shuo
 * @Date 2021/1/3 14:09
 * @Version 1.0
 */
public class PhoneProduct implements Product {

    private final ProductEnum productEnum;

    public PhoneProduct(ProductEnum productEnum){
        this.productEnum = productEnum;
    }
    @Override
    public ProductEnum getProduct() {
        return productEnum;
    }

    @Override
    public String toString() {
        return "phoneProduct"+productEnum;
    }
}
