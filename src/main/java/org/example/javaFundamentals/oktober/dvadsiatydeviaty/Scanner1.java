package org.example.javaFundamentals.oktober.dvadsiatydeviaty;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //zapamätať
        String vstup = sc.nextLine();
        System.out.println("Uživateľ zadal " + vstup);
    }
}
