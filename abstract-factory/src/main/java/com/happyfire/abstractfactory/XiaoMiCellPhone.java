package com.happyfire.abstractfactory;

/**
 * @Author deng shuo
 * @Date 2021/1/3 16:07
 * @Version 1.0
 */
public class XiaoMiCellPhone implements CellPhone {
    private final String DESCRIPTION = "this is XiaoMi cellphone ,xiaomi 11";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
