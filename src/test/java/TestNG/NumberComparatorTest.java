package TestNG;

import org.example.Lesson_14_testng.NumberComparator;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class NumberComparatorTest {

    @Test
    public void testFirstNumberGreater() {
        String result = NumberComparator.compare(10, 5);
        assertEquals(result, "10 больше 5");
    }

    @Test
    public void testSecondNumberGreater() {
        String result = NumberComparator.compare(3, 8);
        assertEquals(result, "3 меньше 8");
    }

    @Test
    public void testNumbersEqual() {
        String result = NumberComparator.compare(4, 4);
        assertEquals(result, "4 равно 4");
    }

    // Дополнительные тесты на граничные случаи
    @Test
    public void testNegativeNumbers() {
        assertEquals(NumberComparator.compare(-1, -5), "-1 больше -5");
        assertEquals(NumberComparator.compare(-10, -3), "-10 меньше -3");
        assertEquals(NumberComparator.compare(-2, -2), "-2 равно -2");
    }

    @Test
    public void testZeroComparison() {
        assertEquals(NumberComparator.compare(0, 0), "0 равно 0");
        assertEquals(NumberComparator.compare(0, 1), "0 меньше 1");
        assertEquals(NumberComparator.compare(1, 0), "1 больше 0");
    }
}