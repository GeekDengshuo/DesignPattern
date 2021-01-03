package com.happyfire.simplefactory;

/**
 * @Author deng shuo
 * @Date 2021/1/3 09:42
 * @Version 1.0
 */
public class SimpleFactory {

    public static Product getProduct(FactoryNameEnum factoryNameEnum){

        switch (factoryNameEnum){
            case NETEASE:
                return new NeteaseProduct();
            case TENCENT:
                return new TencentProduct();
            default:
                return new DefalutProduct();
        }
    }
}
