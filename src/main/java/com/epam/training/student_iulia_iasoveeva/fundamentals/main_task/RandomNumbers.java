package com.epam.training.student_iulia_iasoveeva.fundamentals.main_task;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        int amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print from new line? y/n");
        String answer = scanner.nextLine();
        System.out.println("Choose amount of numbers: ");
        amount = scanner.nextInt();
        Random rand = new Random();

        for (int i = 0; i < amount; i++) {
            int int_random = rand.nextInt();
            String result = "Random number: " + int_random + " ";
            if ("y".equalsIgnoreCase(answer)) {
                System.out.println(result);
            } else {
                System.out.print(result);
            }
        }
    }
}
