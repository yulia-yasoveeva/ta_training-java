package com.epam.training.student_iulia_iasoveeva.fundamentals.opsional_task1;

import java.util.Scanner;

public class numberByLenght {
    public static void main(String[] args) {
        int[] array;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity of numbers: ");
        n = scanner.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
          }
    int length = String.valueOf(array).length();
          
}
