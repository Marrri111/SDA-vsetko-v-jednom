package org.example.cvicenia.tables;

import java.util.Scanner;

public class FifteenthExercise {
    public static void main(String[] args) {
        int n = 5;
        String[] names = new String[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name: ");
            names[i] = scanner.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("Hello " + names[i]);
        }


    }
}
