package com.happyfire.abstractfactory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class AbstractFactoryApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void shouldExecuteApplicationWithoutException(){
        assertDoesNotThrow(()->AbstractFactoryApplication.main(new String[] {}));
    }

}
