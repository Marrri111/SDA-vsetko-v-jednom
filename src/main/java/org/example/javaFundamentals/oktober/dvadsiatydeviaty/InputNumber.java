package org.example.javaFundamentals.oktober.dvadsiatydeviaty;

import java.util.Scanner;

public class InputNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj číslo");
        int a = Integer.parseInt(scanner.nextLine()); //obalilo sa mi to do parseInt
        System.out.println("Zadaj druhé číslo");
        int b = Integer.parseInt(scanner.nextLine()); //mne stačí napísať int b = scanner.nextLine(); a potom mi intelina pomôže
        System.out.println("Výsledok je " + (a + b));
    }
}
