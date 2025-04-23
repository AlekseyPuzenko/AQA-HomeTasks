package org.example.Lesson_12;

public class Main {
    public static void main(String[] args) {
        // Пример корректного массива
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Пример массива с ошибкой в данных
        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "XX", "12"},
                {"13", "14", "15", "16"}
        };

        // Пример массива неправильного размера
        String[][] wrongSizeArray = {
                {"1", "2", "3"},
                {"5", "6", "7"},
                {"9", "10", "11"}
        };

        ArrayMethods arrayMethods = new ArrayMethods();

        // Проверка корректного массива
        try {
            System.out.println("Сумма элементов корректного массива: " +
                    arrayMethods.checkSizeAndSummArray(correctArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        // Проверка массива с неверными данными
        try {
            System.out.println("Сумма элементов массива с ошибкой в данных: " +
                    arrayMethods.checkSizeAndSummArray(invalidDataArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        // Проверка массива неправильного размера
        try {
            System.out.println("Сумма элементов массива неправильного размера: " +
                    arrayMethods.checkSizeAndSummArray(wrongSizeArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        // Генерация и обработка ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            int value = arr[10]; // Здесь возникнет исключение
            System.out.println("Значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Поймано ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }


}














