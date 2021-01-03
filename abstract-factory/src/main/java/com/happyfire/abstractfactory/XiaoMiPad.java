package com.happyfire.abstractfactory;

/**
 * @Author deng shuo
 * @Date 2021/1/3 16:10
 * @Version 1.0
 */
public class XiaoMiPad implements Pad {
    private final String DESCRIPTION = "this is XiaoMi Pad,miPad 1";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
