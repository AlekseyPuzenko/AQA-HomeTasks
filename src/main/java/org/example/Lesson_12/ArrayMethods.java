package org.example.Lesson_12;

public class ArrayMethods {
    public int checkSizeAndSummArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Количество строк должно быть равно 4");
        }
        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException("Количество элементов строки должно быть равно 4");
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в ячейке [" + i + "][" + j + "]: '" +
                            array[i][j] + "' не является числом");
                }
            }
        }
        return sum;
    }
}
