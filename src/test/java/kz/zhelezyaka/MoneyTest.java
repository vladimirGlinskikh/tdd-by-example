package kz.zhelezyaka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    void testMultiplication() {
        Dollar coin = new Dollar(5);
        Dollar product = coin.times(2);
        assertEquals(10, product.amount);
        product = coin.times(3);
        assertEquals(15, product.amount);
        product = coin.times(4);
        assertEquals(20, product.amount);
    }
}
