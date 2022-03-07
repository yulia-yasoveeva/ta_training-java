package com.epam.training.student_iulia_iasoveeva.java_classes.main_task;

public class Printer {
    private static final String LINE = "--------------------------------";

    private Printer() {
    }

    public static void printStudents(Student[] students) {
        print(LINE);
        for (Student s : students) {
            print(s);
        }
        print(LINE);
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}
