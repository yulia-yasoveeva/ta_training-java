package com.epam.training.student_iulia_iasoveeva.fundamentals.optional_task1;

import java.util.Scanner;

public class AverageLength {
    public static void main(String[] args) {
        int[] array = new int[8];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        for (int i = 0; i < 8; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Length of numbers: ");
        int sum = 0;
        int avgLength;
        int[] size = new int[8];
        for (int i = 0; i < 8; i++) {
            size[i] = String.valueOf(array[i]).length();
            System.out.println(size[i]);
            sum = sum + size[i];
        }
        avgLength = sum / array.length;
        System.out.println("Average length: " + avgLength);


        System.out.println("Numbers with length less then average: ");
        for (int i = 0; i < 8; i++) {
            if (size[i] < avgLength) {
                System.out.println(array[i] + " " + size[i]);
            }
        }
    }

}

