package com.happyfire.abstractfactory;

/**
 * @Author deng shuo
 * @Date 2021/1/3 16:09
 * @Version 1.0
 */
public class XiaoMiComputer implements Computer {
    private final String DESCRIPTION = "this is XiaoMi computer,MiBook 14";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
