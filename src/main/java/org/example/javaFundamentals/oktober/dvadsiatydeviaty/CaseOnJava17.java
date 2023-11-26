package org.example.javaFundamentals.oktober.dvadsiatydeviaty;

import java.util.Scanner;

public class CaseOnJava17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj prvé číslo");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadaj operátor");
        String b = scanner.nextLine();
        System.out.println("Zadaj druhé číslo");
        int c = Integer.parseInt(scanner.nextLine());
        int vysledok;
        switch (b) {
            case "+" -> vysledok = a + c;
            case "-" -> vysledok = a - c;
            case "*" -> vysledok = a * c;
            case "/" -> vysledok = a / c;
            default -> vysledok = 0;
        }
        // to isté, len iným spôsobom
        System.out.println(vysledok);
        vysledok = switch (b) {
            case "+" -> a + c;
            case "-" -> a - c;
            case "*" -> a * c;
            case "/" -> a / c;
            default -> 0;
        };
        String mesiac = "Január";
        String rocneObdobie = switch (mesiac) {
            case "December", "Január", "Február" -> "Zima";
            case "Marec", "Apríľ", "Máj" -> "Jar";
            case "Jún", "Júl", "August" -> "Leto";
            case "September", "Október", "November" -> "Jeseň";
            default -> "Neznámy mesiac";
        };
        System.out.println(rocneObdobie);
    }
}
