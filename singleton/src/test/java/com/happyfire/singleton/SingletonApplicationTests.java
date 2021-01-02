package com.happyfire.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class SingletonApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void shouldExecuteWithoutException(){
        assertDoesNotThrow(()->SingletonApplication.main(new String[]{}));
    }

}
