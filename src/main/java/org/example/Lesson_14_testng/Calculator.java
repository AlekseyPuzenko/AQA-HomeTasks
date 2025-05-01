package Lesson_14_testng;

public class Calculator {
    public static int calculate(int a, int b, String action) {
        switch (action) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("Делить на 0 нельзя");
                return a / b;
            default: throw new IllegalArgumentException("Unknown operation: " + action);
        }
    }
}
