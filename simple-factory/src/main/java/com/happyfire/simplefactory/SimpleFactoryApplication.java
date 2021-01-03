package com.happyfire.simplefactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleFactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleFactoryApplication.class, args);

        FactoryNameEnum cur = FactoryNameEnum.NETEASE;
        Product product = SimpleFactory.getProduct(cur);
        product.CreateProduct();
    }

}
