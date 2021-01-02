package com.happyfire.singleton;

/**
 * @Author deng shuo
 * @Date 2021/1/2 17:00
 * @Version 1.0
 */
public class ThreadSafeHungry {

    private static volatile ThreadSafeHungry INSTANCE = new ThreadSafeHungry();

    private ThreadSafeHungry(){

    }

    public static ThreadSafeHungry getInstance(){
        return INSTANCE;
    }
}
