package org.example.Lesson_11;

public class Dog extends Animals {

    private boolean satiety;
    private static int dogTotal = 0;

    public Dog(String name) {
        super(name);
        dogTotal++;
    }
    public static int getDogTotal() {
        return dogTotal;
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println(name + " пробежал 500 метром и дальше не побежит, пока не отдохнёт");
        } else if (distance < 0) {
            System.out.println(name + " разворачивается и бежит " + distance * (-1) + " метров в обратную сторону");
        } else if (distance == 0) {
            System.out.println(name + " стоит на месте, виляя хвостом");
        } else {
            super.run(distance);
        }

    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println(name + " не может проплыть " + distance + "метров. Перестаньте издеваться над животным!");
        } else if (distance < 0) {
            System.out.println(name + " не понимает как можно проплыть отрицательное расстояние");
        } else if (distance == 0) {
            System.out.println(name + " сидит на берегу, ведь плыть никуда не нужно");
        } else {
            super.swim(distance);
        }
    }
}


