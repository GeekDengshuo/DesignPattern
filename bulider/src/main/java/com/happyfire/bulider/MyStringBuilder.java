package com.happyfire.bulider;

/**
 * @Author deng shuo
 * @Date 2021/1/10 10:12
 * @Version 1.0
 */
public class MyStringBuilder extends MyAbstractStringBuilder {

    /**
     * default char array length = 1<<5 , 16
     */
    public MyStringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        return new String(value,0,count);
    }
}
