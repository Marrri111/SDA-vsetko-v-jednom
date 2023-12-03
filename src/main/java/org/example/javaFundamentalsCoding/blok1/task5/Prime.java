package org.example.javaFundamentalsCoding.blok1.task5;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimeDefinition primeDefinition = new PrimeDefinition();
        System.out.println("Zadejte číslo k overení:");
        int number = scanner.nextInt();
        boolean prime = primeDefinition.isPrime(number);
        if (prime == true) {
            System.out.println(number + " je prvočíslo.");
        } else {
            System.out.println(number + " není prvočíslo.");
        }
    }
}
