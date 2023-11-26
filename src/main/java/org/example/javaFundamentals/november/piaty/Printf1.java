package org.example.javaFundamentals.november.piaty;

public class Printf1 {
    public static void main(String[] args) {
        double d = 2.48484;
        System.out.printf("hodnota cisla je %.3f", d);//tento spôsob mi zaokruhluje číslo na toľko čísel, koľko mu zadám
        System.out.println();
        int a = 3;
        int b = 4;
        String s = String.format("%s+%s=%s", a, b, a + b);
        System.out.println(s);
        System.out.println(String.format("%.0f / %.0f=%.2f", 1.0, 3.0, 1.0 / 3));
    }
}
