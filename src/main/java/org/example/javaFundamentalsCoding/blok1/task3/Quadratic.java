package org.example.javaFundamentalsCoding.blok1.task3;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj hodnotu a:");
        int a = scanner.nextInt();
        System.out.println("Zadaj hodnotu b");
        int b = scanner.nextInt();
        System.out.println("Zadaj hodnotu c");
        int c = scanner.nextInt();

        QuadraticCalculator quadraticCalculator = new QuadraticCalculator();
        int delta = quadraticCalculator.calculateDiscriminant(a, b, c);


        if (delta < 0) {
            System.out.println("Delta negative");
            scanner.close();
            System.exit(1);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Solution: " + x);
            scanner.close();
            System.exit(2);
        }

        double squareRoot = Math.sqrt(delta);

        double x1 = quadraticCalculator.rootX1(a, b, squareRoot);

        double x2 = quadraticCalculator.rootX2(a, b, squareRoot);

        System.out.println("Solution x1: " + x1);
        System.out.println("Solution x2: " + x2);
        scanner.close();
        System.exit(3);
    }
}
