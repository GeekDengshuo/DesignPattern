package com.happyfire.bulider;

import java.util.Arrays;

/**
 * @Author deng shuo
 * @Date 2021/1/10 09:45
 * @Version 1.0
 */
public class MyAbstractStringBuilder {

    protected char[] value;

    protected int count;

    //private int oldCapacity;

    public MyAbstractStringBuilder(int num){
        value = new char[num];
        count = 0;
    }

    public MyAbstractStringBuilder append(char c){
        ensureCapacityInternal(count+1);

        value[count++] = c;

        return this;

    }

    /**
     * dynamic expanding
     * @param miniCapacity
     */
    private void ensureCapacityInternal(int miniCapacity){
        if(miniCapacity - value.length > 0){
            expandingCapacity(miniCapacity);
        }
    }

    private void expandingCapacity(int miniCapacity){
        int newCapacity = value.length * 2 + 2;
        if(newCapacity - miniCapacity < 0){
            newCapacity = miniCapacity;
        }
        if(newCapacity < 0){

            // overflow
            if(miniCapacity < 0){
                newCapacity = Integer.MAX_VALUE;
            }
        }
        value = Arrays.copyOf(value,newCapacity);
    }

}
