package com.epam.training.student_iulia_iasoveeva.java_classes.main_task_2;

public class Printer {
    public static final String LINE = "-----------------------------------------";

    private Printer() {
    }

    public static void printCustomer(Customer[] customers) {
        System.out.println(LINE);
        for (Customer c : customers) {
            System.out.println(c);
        }
        System.out.println(LINE);
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}

