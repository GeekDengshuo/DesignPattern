package com.happyfire.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SingletonApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SingletonApplication.class, args);
        System.out.println("hello world");

        // double checked
        var threadSafeDoubleCheckedOne =  ThreadSafeDoubleChecked.getInstance();
        var threadSafeDoubleCheckedTwo = ThreadSafeDoubleChecked.getInstance();
        LOGGER.info("threadSafeDoubleCheckedOne = {}",threadSafeDoubleCheckedOne);
        LOGGER.info("threadSafeDoubleCheckedTwo = {}",threadSafeDoubleCheckedTwo);

        // enum
        var threadSafeEnumOne = ThreadSafeEnum.INSTANCE;
        var threadSafeEnumTwo = ThreadSafeEnum.INSTANCE;

        LOGGER.info("threadSafeEnumOne = {}",threadSafeEnumOne);
        LOGGER.info("threadSafeEnumTwo = {}",threadSafeEnumTwo);

        // hungry loading ,eagerly initialized
        var threadSafeHungryFirst = ThreadSafeHungry.getInstance();
        var threadSafeHungrySecond = ThreadSafeHungry.getInstance();
        LOGGER.info("threadSafeHungryFirst = {}",threadSafeHungryFirst);
        LOGGER.info("threadSafeHungrySecond ={}",threadSafeHungrySecond);

        // inner static class

        var threadSafeStaticInnerClassFirst = ThreadSafeStaticInnerClass.getInstance();
        var threadSafeStaticInnerClassSecond = ThreadSafeStaticInnerClass.getInstance();

        LOGGER.info(threadSafeStaticInnerClassFirst.toString());
        LOGGER.info(threadSafeStaticInnerClassSecond.toString());


    }

}
