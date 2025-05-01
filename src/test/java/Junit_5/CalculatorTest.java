package Junit_5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(5, org.example.lesson_14_testng.Calculator.calculate(2, 3, "+"));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, org.example.lesson_14_testng.Calculator.calculate(4, 3, "-"));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, org.example.lesson_14_testng.Calculator.calculate(2, 3, "*"));
    }

    @Test
    void testDivision() {
        assertEquals(2, org.example.lesson_14_testng.Calculator.calculate(6, 3, "/"));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class,
                () -> org.example.lesson_14_testng.Calculator.calculate(5, 0, "/"));
    }

    @Test
    void testUnknownOperation() {
        assertThrows(IllegalArgumentException.class,
                () -> org.example.lesson_14_testng.Calculator.calculate(2, 3, "%"));
    }

    @Test
    void testCaseSensitiveOperation() {
        // Проверяем чувствительность к регистру
        assertThrows(IllegalArgumentException.class,
                () -> org.example.lesson_14_testng.Calculator.calculate(2, 3, "Add"));
    }
}