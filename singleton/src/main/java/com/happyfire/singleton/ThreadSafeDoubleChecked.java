package com.happyfire.singleton;

/**
 * @Author deng shuo
 * @Date 2021/1/2 16:52
 * @Version 1.0
 */
public final class ThreadSafeDoubleChecked {

    // lazy loading
    private static volatile ThreadSafeDoubleChecked INSTANCE ;

    private ThreadSafeDoubleChecked(){

    }

    public static ThreadSafeDoubleChecked getInstance(){
        if(INSTANCE == null){
            synchronized (ThreadSafeDoubleChecked.class){
                if(INSTANCE == null){
                    INSTANCE = new ThreadSafeDoubleChecked();
                }
            }
        }
        return INSTANCE;
    }
}
