package org.example.Lesson_11;

public class Animals {
    protected String name;

    private static int animalTotal = 0;

    public Animals(String name) {
        this.name = name;
        animalTotal++;
    }

    public static int getAnimalTotal() {
        return animalTotal;
    }


    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }
}
