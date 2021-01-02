package com.happyfire.singleton;

import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Supplier;

/**
 * @Author deng shuo
 * @Date 2021/1/2 20:49
 * @Version 1.0
 */
public class ThreadSafeDoubleCheckedTest extends SingletonTest<ThreadSafeDoubleChecked> {

    public ThreadSafeDoubleCheckedTest() {
        super(ThreadSafeDoubleChecked::getInstance);
    }

    @Test
    public void testCreatingNewInstanceByReflection() throws Exception{
        ThreadSafeDoubleChecked.getInstance();
        var constructor = ThreadSafeDoubleChecked.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance((Object[]) null);
    }
}
