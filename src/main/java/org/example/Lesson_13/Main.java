package org.example.Lesson_13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Телефонный справочник");
        demoPhoneDirectory();

        System.out.println("\nРабота со студентами");
        demoStudentManagement();
    }

    private static void demoPhoneDirectory() {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Иванов", "123-456");
        phoneDirectory.add("Петров", "789-012");
        phoneDirectory.add("Иванов", "345-678");
        phoneDirectory.add("Сидоров", "901-234");

        System.out.println("Иванов: " + phoneDirectory.get("Иванов"));
        System.out.println("Петров: " + phoneDirectory.get("Петров"));
        System.out.println("Смирнов: " + phoneDirectory.get("Смирнов")); // Несуществующая фамилия
    }

    private static void demoStudentManagement() {

        Set<Student> students = new HashSet<>(Arrays.asList(
                new Student("Иван Иванов", 101, 1,
                        Arrays.asList(4, 5, 3, 4)),
                new Student("Петр Петров", 102, 2,
                        Arrays.asList(3, 3, 2, 3)),
                new Student("Сидор Сидоров", 103, 1,
                        Arrays.asList(5, 5, 5, 5)),
                new Student("Анна Иванова", 201, 2,
                        Arrays.asList(2, 2, 2, 2))
        ));

        System.out.println("Исходный список студентов:");
        students.forEach(System.out::println);

        StudentUtils.removeUnderperformingStudents(students);
        System.out.println("\nПосле удаления двоечников:");
        students.forEach(System.out::println);

        StudentUtils.promoteStudents(students);
        System.out.println("\nПосле перевода на следующий курс:");
        students.forEach(System.out::println);

        StudentUtils.printStudents(students, 2);
    }
}