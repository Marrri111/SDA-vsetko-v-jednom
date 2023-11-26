package org.example.javaFundamentals.november.stvrty;

import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadavej text Exit pro ukonceni");
        String readedLine = "";
        while ((!readedLine.equals("exit"))) {
            readedLine = scanner.nextLine();
            System.out.println(readedLine.toUpperCase());
        }
    }
}
