package org.example.javaFundamentalsCoding.blok1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //najskôr sa spýtame užívateľa na vstupné dáta
        System.out.print("Please enter the diameter (in cm:");//diameter -> priemer
        Scanner scanner = new Scanner(System.in);
        double diameter = 0.0; //od riadku 10 po riadok 16 robím výnimku, ak by sa mi zadal užívateľ nevhodný vstup
        try {
            diameter = scanner.nextDouble();
            if (diameter <= 0) {
                System.out.println("Ospravedlňujem sa, záporné čísla nie sú povolené.");
                System.exit(2);
            }
        } catch (Exception e) {
            System.out.println("Ospravedlnujem sa, nezvolil si správne číslo.");
            System.exit(1);
        }

        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        double perimeter = perimeterCalculator.calculatePerimeter(diameter);//perimeter -> obvod
        scanner.close();
        System.out.println("Perimeter is: " + perimeter + " cm");
    }

}
