package Junit_5;

import org.example.Lesson_14_testng.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testCalculateAreaWithValidSides() {

        assertEquals(6.0, Triangle.calculateArea(3, 4, 5), 0.001);

        assertEquals(17.412, Triangle.calculateArea(5, 7, 9), 0.001);
    }

    @Test
    void testCalculateAreaWithZeroSide() {
        assertThrows(IllegalArgumentException.class, () ->
                Triangle.calculateArea(0, 4, 5));
    }

    @Test
    void testCalculateAreaWithNegativeSide() {
        // Отрицательная сторона (исправлено название метода)
        assertThrows(IllegalArgumentException.class, () ->
                Triangle.calculateArea(3, -4, 5));
    }
}