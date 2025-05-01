package TestNG;

import org.example.Lesson_14_testng.FactorialCalculator;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class FactorialCalculatorTest {


    @Test
    public void testFactorialOfZero() {
        assertEquals(FactorialCalculator.calculateFactorial(0), 1L);
    }
    public void testFactorialOfOne() {
        assertEquals(FactorialCalculator.calculateFactorial(1), 1L);
    }

    @Test
    public void testFactorialOfFive() {
        assertEquals(FactorialCalculator.calculateFactorial(5), 120L);
    }

    @Test
    public void testFactorialOfTen() {
        assertEquals(FactorialCalculator.calculateFactorial(10), 3_628_800L);
    }

    @Test
    public void testNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () ->
                FactorialCalculator.calculateFactorial(-1)
        );
    }
}