package com.happyfire.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractFactoryApplication.class);

    private static final Product product = new Product();

    public Product getProduct(){return product;}

    public static void main(String[] args) {
        SpringApplication.run(AbstractFactoryApplication.class, args);

        var app = new AbstractFactoryApplication();
        app.run();
    }


    public void run(){
        LOGGER.info("Apple Product");

        createProduct(Product.factoryMaker.FactoryType.APPLE);
        LOGGER.info(product.getCellPhone().getDescription());
        LOGGER.info(product.getComputer().getDescription());
        LOGGER.info(product.getPad().getDescription());

        LOGGER.info("XiaoMi Product");
        createProduct(Product.factoryMaker.FactoryType.XIAOMI);
        LOGGER.info(product.getCellPhone().getDescription());
        LOGGER.info(product.getComputer().getDescription());
        LOGGER.info(product.getPad().getDescription());
    }

    public static void createProduct(final Product.factoryMaker.FactoryType factoryType){
        final ProductFactory productFactory = Product.factoryMaker.makeFactory(factoryType);
        product.setCellPhone(productFactory.createCellPhone());
        product.setComputer(productFactory.createComputer());
        product.setPad(productFactory.createPad());


    }

}
