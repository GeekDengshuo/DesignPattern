package com.happyfire.factorymethod;

/**
 * @Author deng shuo
 * @Date 2021/1/3 14:21
 * @Version 1.0
 */
public class PhoneFactory implements FactoryMethod {
    @Override
    public Product manufacture(ProductEnum productEnum) {
       if(productEnum == ProductEnum.PHONE){
           return new PhoneProduct(productEnum);
       }
       else{
           return null;
       }


    }
}
