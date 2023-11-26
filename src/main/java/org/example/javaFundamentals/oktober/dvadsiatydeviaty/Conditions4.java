package org.example.javaFundamentals.oktober.dvadsiatydeviaty;

import java.util.Scanner;

public class Conditions4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj prvé číslo");
        int a = Integer.parseInt(sc.nextLine());
        if (a > 0) {
            System.out.println("Kladné číslo");
        } else if (a < 0) {
            System.out.println("Záporné číslo");
        } else {
            System.out.println("Číslo je rovné 0");
        }
    }
}
