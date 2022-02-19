package com.epam.training.student_iulia_iasoveeva.fundamentals;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        String userName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName.substring(0, 1).toUpperCase()
                + userName.substring(1).toLowerCase() + "!");
    }
}
