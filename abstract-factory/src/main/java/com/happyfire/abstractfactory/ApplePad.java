package com.happyfire.abstractfactory;

/**
 * @Author deng shuo
 * @Date 2021/1/3 16:06
 * @Version 1.0
 */
public class ApplePad implements Pad {
    private final String DESCRIPTION = "this is apple pad , iPad pro 13inch";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
