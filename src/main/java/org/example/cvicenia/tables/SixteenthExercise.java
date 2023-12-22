package org.example.cvicenia.tables;

import java.util.Scanner;

public class SixteenthExercise {
    public static void main(String[] args) {
        int v = 6;
        int[] numbers = new int[v];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < v; i++) {
            System.out.println("Enter the number: ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Arithmetic average: " + (float) (sum / numbers.length));
    }
}
