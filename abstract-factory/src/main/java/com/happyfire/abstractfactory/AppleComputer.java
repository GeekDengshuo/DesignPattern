package com.happyfire.abstractfactory;

/**
 * @Author deng shuo
 * @Date 2021/1/3 16:05
 * @Version 1.0
 */
public class AppleComputer implements Computer {
    private final String DESCRIPTION = "this is apple computer,MacBookPro 16inch";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
