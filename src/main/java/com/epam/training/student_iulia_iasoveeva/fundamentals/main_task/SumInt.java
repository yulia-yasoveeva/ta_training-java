package com.epam.training.student_iulia_iasoveeva.fundamentals.main_task;

import java.util.Scanner;

public class SumInt {
    public static void main(String[] args) {
        int arg, arg1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        arg = scanner.nextInt();
        System.out.println("Enter second integer: ");
        arg1 = scanner.nextInt();

        int resultSum = arg + arg1;
        int resultMult = arg * arg1;
        System.out.println("Total sum: " + resultSum + ", Total multiplication: " + resultMult);
    }
}
