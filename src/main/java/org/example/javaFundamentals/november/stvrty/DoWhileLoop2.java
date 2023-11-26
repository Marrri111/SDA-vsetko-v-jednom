package org.example.javaFundamentals.november.stvrty;

import java.util.Scanner;

public class DoWhileLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            System.out.println("napíš niečo, alebo exit ak chceš skončiť");
            line = scanner.nextLine();
        } while (!line.equals("exit"));
    }
}
