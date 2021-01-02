package com.happyfire.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Author deng shuo
 * @Date 2021/1/2 20:17
 * @Version 1.0
 */
public abstract class SingletonTest<S> {

    private final Supplier<S> singletonInstanceMethod;

    public SingletonTest(final Supplier<S> singletonInstanceMethod){
        this.singletonInstanceMethod = singletonInstanceMethod;
    }

    /**
     * no concurrent test
     */
    @Test
    public void testMultipleCallsReturnSameObjectMethodInSameThread(){
        // create the instance
        var instance1 = this.singletonInstanceMethod.get();
        var instance2 = this.singletonInstanceMethod.get();
        var instance3 = this.singletonInstanceMethod.get();
        //var instance4 = ThreadSafeHungry.getInstance();

        // check is same
        assertSame(instance1,instance2);
        assertSame(instance1,instance3);
        assertSame(instance2,instance3);
        //assertSame(instance1,instance4);
    }

    @Test
    public void testMultipleCallsReturnSameObjectMethodInConcurrentThread() throws Exception{
        assertTimeout(Duration.ofMillis(10000),()->{
            final var tasks = IntStream.range(0,10000)
                    .<Callable<S>>mapToObj(i -> this.singletonInstanceMethod::get)
                    .collect(Collectors.toCollection(ArrayList::new));


            final var executorService = Executors.newFixedThreadPool(8);
            final var results = executorService.invokeAll(tasks);

            final var expectedInstance = this.singletonInstanceMethod.get();
            for( var result : results){
                final var instance = result.get();
                assertNotNull(instance);
                assertSame(expectedInstance,instance);
            }

            executorService.shutdown();
        });
    }
}
