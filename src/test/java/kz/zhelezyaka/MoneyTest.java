package kz.zhelezyaka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplication() {
        Dollar coin = new Dollar(5);
        Dollar product = coin.times(2);
        assertEquals(new Dollar(10), product);
        product = coin.times(3);
        assertEquals(new Dollar(15), product);
        product = coin.times(4);
        assertEquals(new Dollar(20), product);
    }

    @Test
    void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(7));
    }
}
