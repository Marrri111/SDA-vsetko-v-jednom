package org.example.javaFundamentals.oktober.dvadsiatydeviaty;

import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadej b");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadaj operátor");
        String op = scanner.nextLine();

        int vysledok = 0;
        switch (op) {
            case "+": // po case dávam dvojbodu
                vysledok = a + b;
                break; //po každom case dávam break, aby to už ďalej nepokračovalo
            case "-":
                vysledok = a - b;
                break;
            case "*":
                vysledok = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Nejde deliť nulou");
                    return; //aby už program ďalej nešiel
                }
                vysledok = a / b;
                break;
            default: //ak by mi dali neznámy operátor, tak mi urobí toto
                System.out.println("Neznámy oprátor");
                return;
        }
        System.out.println(a + op + b + "=" + vysledok);
    }
}
