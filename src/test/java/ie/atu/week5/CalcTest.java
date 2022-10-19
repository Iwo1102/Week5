package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    Calc newCalc;
    @BeforeEach
    void setUp() {
        newCalc = new Calc();
    }

    @Test
    void testAdd()
    {
        assertEquals(6, Calc.add(4,2));
    }

    @Test
    void testSubract()
    {
        assertEquals(10, Calc.subtract(14,4));
    }

    @Test
    void testMultiply()
    {
        assertEquals(45, Calc.multiply(9,5));
    }

    @AfterEach
    void tearDown() {
    }
}