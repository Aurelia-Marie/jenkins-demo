package demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculTest {
    private final Calcul calcul = new Calcul();

    @Test
    void testAddition() { assertEquals(5, calcul.addition(2, 3)); }

    @Test
    void testSoustraction() { assertEquals(1, calcul.soustraction(3, 2)); }

    @Test
    void testDivision() { assertEquals(3, calcul.division(6, 3)); }
}
