package kz.zhelezyaka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplicationDollar() {
        Money coin = Money.dollar(5);
        assertEquals(Money.dollar(10), coin.times(2));
        assertEquals(Money.dollar(15), coin.times(3));
        assertEquals(Money.dollar(20), coin.times(4));
    }

    @Test
    void testEqualityDollar() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(7));
        assertNotEquals(Money.dollar(5), Money.dollar(8));
    }

    @Test
    void testMultiplicationFranc() {
        Money coin = Money.franc(5);
        assertEquals(Franc.franc(10), coin.times(2));
        assertEquals(Franc.franc(15), coin.times(3));
        assertEquals(Franc.franc(20), coin.times(4));
    }

    @Test
    void testEqualityFranc() {
        assertEquals(Franc.franc(5), Money.franc(5));
        assertNotEquals(Franc.franc(5), Money.franc(7));
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
