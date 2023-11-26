package org.example.javaFundamentals.oktober.dvadsiatydeviaty;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj mesiac v roku Január - December");
        String mesiac = scanner.nextLine().toUpperCase(); //.toUpperCase mi napíše všetko veľkými písmenami
        switch (mesiac) {
            case "DECEMBER":
            case "JANUAR":
            case "FEBRUAR":
                System.out.println("ZIMA");
                break;
            case "MAREC":
            case "APRIL":
            case "MAJ":
                System.out.println("JAR");
                break;
            case "JUN":
            case "JUL":
            case "AUGUST":
                System.out.println("LETO");
                break;
            case "SEPTEMBER":
            case "OKTOBER":
            case "NOVEMBER":
                System.out.println("JESEN");
                break;
            default:
                System.out.println("Nie je to mesiac");
        }
    }
}
