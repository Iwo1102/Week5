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
    @AfterEach
    void tearDown() {
    }
}