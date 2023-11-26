package org.example.javaFundamentals.november.stvrty;

import java.util.Scanner;

public class InnerLoop1 {
    public static void main(String[] args) {
        //write program for computing n! entered from user, end if user enter stop
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj číslo pre výpočet, alebo stop pre ukončenie");
        do {
            String line = scanner.nextLine();
            if (line.equals("stop")) {
                break;
            }
            int n = Integer.parseInt(line);
            int fact = 1;
            if (n >= 1) {
                for (int i = 1; i <= n; i++) {
                    fact *= i;
                }
                System.out.println("n! = " + fact);
            } else {
                System.out.println("Zo záporného čísla sa faktoriál nedá vypočítať");
            }
        } while (true);
    }
}
