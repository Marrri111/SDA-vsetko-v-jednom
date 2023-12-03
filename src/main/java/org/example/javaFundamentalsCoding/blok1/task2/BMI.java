package org.example.javaFundamentalsCoding.blok1.task2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj hmotnosť");
        float weight = scanner.nextFloat();
        System.out.println("Zadaj výšku");
        int height = scanner.nextInt();
        double bmi = (weight / ((height / 100.00) * (height / 100.00)));
        //DecimalFormat decimalFormat = new DecimalFormat("#,##");
        //float roundedNumber = Float.parseFloat(decimalFormat.format(bmi));
        double roundedNumber = Math.round(bmi * 100) / 100.0;
        System.out.println(roundedNumber);
        if (18.5 <= roundedNumber && roundedNumber <= 24.9) {
            System.out.println("BMI optimal");
        } else {
            System.out.println("BMI not optimal");
        }
    }
}
