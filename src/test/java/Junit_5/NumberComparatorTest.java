package Junit_5;

import org.example.Lesson_14_junit_5.NumberComparator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberComparatorTest {

    // Стандартные тестовые случаи
    @Test
    void testFirstGreaterThanSecond() {
        String result = NumberComparator.compare(5, 3);
        assertEquals("5 больше 3", result);
    }

    @Test
    void testFirstLessThanSecond() {
        String result = NumberComparator.compare(2, 4);
        assertEquals("2 меньше 4", result);
    }

    @Test
    void testNumbersEqual() {
        String result = NumberComparator.compare(7, 7);
        assertEquals("7 равно 7", result);
    }

    // Тест граничных случаев
    @Test
    void testMaxIntComparison() {
        String result = NumberComparator.compare(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MAX_VALUE + " больше 1", result);
    }

    @Test
    void testMinIntComparison() {
        String result = NumberComparator.compare(Integer.MIN_VALUE, 0);
        assertEquals(Integer.MIN_VALUE + " меньше 0", result);
    }

    void testCompareWithVariousInputs(int a, int b, String expected) {
        String actual = NumberComparator.compare(a, b);
        assertEquals(expected, actual);
    }
}
