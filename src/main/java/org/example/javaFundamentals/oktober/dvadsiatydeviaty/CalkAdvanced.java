package org.example.javaFundamentals.oktober.dvadsiatydeviaty;

import java.util.Scanner;

public class CalkAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj prvé číslo");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadaj operátor");
        String b = scanner.nextLine();
        System.out.println("Zadaj druhé číslo");
        int c = Integer.parseInt(scanner.nextLine());

        int vysledok = 0;
        if (b.equals("+")) {
            vysledok = a + c;

        } else if (b.equals("-")) {
            vysledok = a - c;

        } else if (b.equals("*")) {
            vysledok = a * c;

        } else if (b.equals("/")) {
            if (c == 0) {
                System.out.println("Nulou sa neda delit");
                return;
            }
            vysledok = a / c;
        } else {
            System.out.println("Zadaj platny operator");
            return;
        }

        System.out.println("Vysledok je ");
        System.out.println(vysledok);
    }
}
