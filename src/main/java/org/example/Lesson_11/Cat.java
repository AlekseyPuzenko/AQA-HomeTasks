package org.example.Lesson_11;

public class Cat extends Animals {
    int oneCatEats = 5;

    private boolean satiety;
    private static int catTotal = 0;

    public Cat(String name, boolean satiety) {
        super(name);
        catTotal++;
        this.satiety = satiety;
    }

    public static int getCatTotal() {
        return catTotal;
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println(name + " пробежал 200 метром и дальше не побежит, пока не отдохнёт");
        } else if (distance < 0) {
            System.out.println(name + " разворачивается и бежит " + distance * (-1) + " метров в обратную сторону");
        } else if (distance == 0) {
            System.out.println(name + " любит, когда не надо никуда бежать." + name + " любит полежать на солнышке");
        } else
            super.run(distance);
    }


    @Override
    public void swim(int distance) {
        if (distance > 0) {
            System.out.println("Вы что, не в курсе, что котики не умеют плавать?!");
        } else if (distance == 0) {
            System.out.println(name + " нежится на солнышке около воды");
        } else
            System.out.println(name + " смотрит на вас с презрением. Даже " + name + " знает, что нельзя проплыть отрицательное расстояние");
    }

    public void feedingCats(Bowl bowl) {

        if (satiety) {
            System.out.printf("Кот %s сыт. \n", name);
            return;
        }

        satiety = bowl.getFeed(oneCatEats);

        if (satiety) {
            System.out.printf("Кот %s накормлен \n", name);
        } else {
            System.out.printf("Кот %s голоден, насыпьте корм в миску\n", name);
        }
    }
}
