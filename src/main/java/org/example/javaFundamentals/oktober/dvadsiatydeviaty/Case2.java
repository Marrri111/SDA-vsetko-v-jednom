package org.example.javaFundamentals.oktober.dvadsiatydeviaty;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj deň v týždni");
        int dayOfWeek = Integer.parseInt(scanner.nextLine());
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Pracovný deň");
                break;
            case 6:
            case 7:
                System.out.println("Víkend");
                break;
            default:
                System.out.println("Ťažko povedať");
        }
    }
}
