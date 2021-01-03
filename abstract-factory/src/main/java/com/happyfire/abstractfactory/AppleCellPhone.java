package com.happyfire.abstractfactory;

/**
 * @Author deng shuo
 * @Date 2021/1/3 16:03
 * @Version 1.0
 */
public class AppleCellPhone implements CellPhone {

    private final String DESCRIPTION = "this is apple cellphone, iphone 12 mini";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
