package com.happyfire.factorymethod;

/**
 * @Author deng shuo
 * @Date 2021/1/3 14:02
 * @Version 1.0
 */
public enum ProductEnum {
    PHONE("telephone"),COMPUTER("PC"),watch("watch");


    private final String title;
    ProductEnum(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
