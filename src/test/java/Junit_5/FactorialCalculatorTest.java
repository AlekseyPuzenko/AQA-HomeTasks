package Junit_5;

import org.example.Lesson_14_junit_5.FactorialCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {
    @Test
    void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, FactorialCalculator.calculateFactorial(1));
    }

    @Test
    void testFactorialOfFive() {
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
    }

    @Test
    void testNegativeInput() {
        assertThrows(IllegalArgumentException.class,
                () -> FactorialCalculator.calculateFactorial(-1));
    }

    @Test
    void testCalculateFactorial() {
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-1));
    }
}
