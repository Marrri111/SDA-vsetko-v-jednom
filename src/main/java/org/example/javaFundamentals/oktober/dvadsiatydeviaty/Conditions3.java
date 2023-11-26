package org.example.javaFundamentals.oktober.dvadsiatydeviaty;

import java.util.Scanner;

public class Conditions3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Zadaj číslo");
        int a = Integer.parseInt(s.nextLine());
        if (a % 2 == 0) {
            System.out.println("Je párne");
        }
        if (a % 2 != 0) {
            System.out.println("Je nepárne");
        }
    }
}
