package com.epam.training.student_iulia_iasoveeva.fundamentals.main_task;

import java.util.Scanner;

public class ReverseArgs {
    public static void main(String[] args) {
        String arg;
        String arg1;
        String arg2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first argument: ");
        arg = scanner.nextLine();
        System.out.println("Enter second argument: ");
        arg1 = scanner.nextLine();
        System.out.println("Enter third argument: ");
        arg2 = scanner.nextLine();
        System.out.println("Result: " + arg2 + " " + arg1 + " " + arg);
    }
}
