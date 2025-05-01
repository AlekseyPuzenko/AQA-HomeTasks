package TestNG;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        assertEquals(org.example.lesson_14_testng.Calculator.calculate(2, 3, "+"), 5);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        org.example.lesson_14_testng.Calculator.calculate(5, 0, "/");
    }
}