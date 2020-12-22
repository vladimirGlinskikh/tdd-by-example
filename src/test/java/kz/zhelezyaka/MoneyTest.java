package kz.zhelezyaka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplication() {
        Money coin = Money.dollar(5);
        assertEquals(Money.dollar(10), coin.times(2));
        assertEquals(Money.dollar(15), coin.times(3));
        assertEquals(Money.dollar(20), coin.times(4));

        Money coinFranc = Money.franc(5);
        assertEquals(Money.franc(10), coinFranc.times(2));
    }

    @Test
    void testEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(7));
        assertNotEquals(Money.dollar(5), Money.dollar(8));

        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.franc(5), Money.franc(7));
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
