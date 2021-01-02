package com.happyfire.singleton;

/**
 * @Author deng shuo
 * @Date 2021/1/2 17:31
 * @Version 1.0
 */
public final class ThreadSafeStaticInnerClass {

    private ThreadSafeStaticInnerClass(){

    }
    private  static class InstanceHolder{
        private final static ThreadSafeStaticInnerClass INSTANCE = new ThreadSafeStaticInnerClass();
    }
    public static ThreadSafeStaticInnerClass getInstance(){
        return InstanceHolder.INSTANCE;
    }
}
