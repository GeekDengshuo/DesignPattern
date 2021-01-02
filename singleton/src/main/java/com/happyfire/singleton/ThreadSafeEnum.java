package com.happyfire.singleton;

/**
 * @Author deng shuo
 * @Date 2021/1/2 16:59
 * @Version 1.0
 */
public enum ThreadSafeEnum {
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName()+"@"+hashCode();
    }
}
