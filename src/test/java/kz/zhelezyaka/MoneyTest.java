package kz.zhelezyaka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplicationDollar() {
        Dollar coin = new Dollar(5);
        Dollar product = coin.times(2);
        assertEquals(new Dollar(10), product);
        product = coin.times(3);
        assertEquals(new Dollar(15), product);
        product = coin.times(4);
        assertEquals(new Dollar(20), product);
    }

    @Test
    void testEqualityDollar() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(7));
        assertNotEquals(new Dollar(5), new Franc(5));
    }

    @Test
    void testMultiplicationFranc() {
        Franc coin = new Franc(5);
        Franc product = coin.times(2);
        assertEquals(new Franc(10), product);
        product = coin.times(3);
        assertEquals(new Franc(15), product);
        product = coin.times(4);
        assertEquals(new Franc(20), product);
    }

    @Test
    void testEqualityFranc() {
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(7));
    }
}
