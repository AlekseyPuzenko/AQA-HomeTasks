package TestNG;

import org.example.Lesson_14_testng.Triangle;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.*;

public class TriangleTest {
    private static final double DELTA = 0.0001;

    // Позитивные тесты
    @Test
    public void testRightTriangleArea() {
        double result = Triangle.calculateArea(3, 4, 5);
        assertEquals(result, 6.0, DELTA, "Площадь прямоугольного треугольника 3-4-5 должна быть 6");
    }

    @Test
    public void testEquilateralTriangleArea() {
        double result = Triangle.calculateArea(2, 2, 2);
        assertEquals(result, Math.sqrt(3), DELTA); // √3 ≈ 1.73205
    }

    // Тесты на исключения
    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Стороны треугольника должны быть положительными")
    public void testZeroSideThrowsException() {
        Triangle.calculateArea(0, 4, 5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeSideThrowsException() {
        Triangle.calculateArea(3, -1, 5);
    }

    // Параметризованные тесты
    @Test(dataProvider = "validTriangles")
    public void testValidTriangles(double a, double b, double c, double expectedArea) {
        double actual = Triangle.calculateArea(a, b, c);
        assertEquals(actual, expectedArea, DELTA);
    }

    @DataProvider(name = "validTriangles")
    public Object[][] validTrianglesData() {
        return new Object[][]{
                {3, 4, 5, 6},
                {5, 5, 6, 12},
                {7, 8, 9, 26.8328},
                {2, 2, 2, Math.sqrt(3)} // Для равностороннего треугольника
        };
    }

    @Test(dataProvider = "invalidTriangles")
    public void testInvalidTriangles(double a, double b, double c) {
        assertThrows(IllegalArgumentException.class, () ->
                Triangle.calculateArea(a, b, c)
        );
    }

    @DataProvider(name = "invalidTriangles")
    public Object[][] invalidTrianglesData() {
        return new Object[][]{
                {0, 1, 1},
                {1, 0, 1},
                {1, 1, 0},
                {-1, 2, 2},
                {1, 2, 10},
                {1, 1, 2}
        };
    }
}