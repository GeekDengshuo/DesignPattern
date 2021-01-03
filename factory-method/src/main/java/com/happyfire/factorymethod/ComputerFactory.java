package com.happyfire.factorymethod;

/**
 * @Author deng shuo
 * @Date 2021/1/3 14:33
 * @Version 1.0
 */
public class ComputerFactory implements FactoryMethod {
    @Override
    public Product manufacture(ProductEnum productEnum) {
        if(productEnum == ProductEnum.COMPUTER){
            return new ComputerProduct(productEnum);

        }
        else{
            return null;
        }
    }
}
