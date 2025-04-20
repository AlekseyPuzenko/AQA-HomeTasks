package org.example.Lesson_11;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Бобик"),
                new Dog("Барбос"),
                new Dog("Мухтар")
        };

        Cat[] cats = {
                new Cat("Мурчелло", false),
                new Cat("Мяурицио", false),
                new Cat("Снежок", false),
        };

        System.out.println("---Собаки---");

        dogs[0].run(500);
        dogs[0].swim(10);

        dogs[1].run(600);
        dogs[1].swim(0);

        dogs[2].run(-10);
        dogs[2].swim(-10);

        System.out.println("---Коты---");

        cats[0].run(5);
        cats[0].swim(5);

        cats[1].run(0);
        cats[1].swim(0);

        cats[2].run(-5);
        cats[2].swim(-5);

        System.out.println("всего животных: " + Animals.getAnimalTotal() + ", из них котов: " + Cat.getCatTotal() + ", а собак: " + Dog.getDogTotal());

        Bowl bowl = new Bowl(12);
        bowl.fillBowl(10);

        for (Cat cat : cats) {
            cat.feedingCats(bowl);
        }
        System.out.println();


        Shape circle = new Circle(3, "Красный", "Чёрный");
        Shape rectangle = new Rectangle(4, 5, "Синий", "Белый");
        Shape triangle = new Triangle(3, 4, 4, "Зелёный", "Жёлтый");

        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}

