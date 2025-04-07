package Lesson_4;

public class Lesson_4 {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(method5(5, 35));
        method6(5);
        System.out.println(method7(5, true));
        method8("Строка", 4);
        System.out.println(method9(120));
        mass10(1, 1, 0, 0, 1, 0);
        mass11();
        mass12(1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1);
        mass13();
        int[] myArray = mass14(5, 10);
        for (int value : myArray) {
            System.out.print(value + " ");
        }

    }

    static void printThreeWords() {
        System.out.println("Orange \nBannana \nApple");
    }

    static void checkSumSign() {
        int a = -5;
        int b = -10;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else System.out.println("Зеленый");
    }

    static void compareNumbers() {
        int a = -5;
        int b = -10;
        if (a >= b) System.out.println("a>=b");
        else System.out.println("a<b");
    }

    public static boolean method5(int a, int b) {
        boolean c;
        if (a + b >= 10 && a + b <= 20) {
            c = true;
        } else {
            c = false;
        }
        return c;
    }

    static void method6(int a) {
        if (a >= 0)
            System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    static boolean method7(int a, boolean c) {
        if (a < 0) {
            c = true;
        } else {
            c = false;
        }
        return c;
    }

    static void method8(String a, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.println(a);
        }
    }

    static boolean method9(int a) {
        boolean b;
        if (a % 400 == 0) {
            b = true;
        } else if (a % 100 == 0) {
            b = false;
        } else if (a % 4 == 0) {
            b = true;
        } else b = false;
        return b;
    }

    static void mass10(int... nums) {
        for (int i = 0; i <= nums.length - 1; i++) {
            switch (nums[i]) {
                case 0:
                    nums[i] = 1;
                    System.out.print(nums[i]);
                    break;
                case 1:
                    nums[i] = 0;
                    System.out.print(nums[i]);
                    break;
            }
        }
        System.out.println();
    }

    static void mass11() {
        int nums[] = new int[100];
        for (int i = 0; i <= nums.length - 1; i++) {
            nums[i] = i + 1;
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    static void mass12(int... nums) {
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] < 6) {
                nums[i] = nums[i] * 2;
                System.out.print(nums[i] + " ");
            } else {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println();
    }

    static void mass13() {
        int nums[][] = new int[5][5];
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                if (i == j) {
                    nums[i][j] = 1;
                } else nums[i][j] = 0;

                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }

    static int[] mass14(int len, int initialValue) {
        int nums[] = new int[len];
        for (int i = 0; i <= nums.length - 1; i++) {
            nums[i] = initialValue;
        }
        return nums;
    }
}

