package com.epam.training.student_iulia_iasoveeva.fundamentals.optional_task1;

import java.util.Scanner;

public class NumberByLength {
    public static void main(String[] args) {
        int[] array;
        int n;
        int[] size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity of numbers: ");
        n = scanner.nextInt();
        System.out.println("Enter numbers: ");
        array = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            array[i] = a;
            size[i] = String.valueOf(a).length();
        }
        System.out.println("Length of numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.println(size[i]);
        }
        int elementMin = 0;
        int elementMax = 0;
        for (int i = 1; i < size.length; i++) {
            if (size[elementMin] > size[i]) {
                elementMin = i;
            }
            if (size[elementMax] < size[i]) {
                elementMax = i;
            }
        }

        System.out.println("The shortest number: " + array[elementMin]);
        System.out.print("The longest number: " + array[elementMax]);
    }
}
