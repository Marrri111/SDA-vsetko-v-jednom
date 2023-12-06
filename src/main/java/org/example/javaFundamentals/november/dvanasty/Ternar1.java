package org.example.javaFundamentals.november.dvanasty;

public class Ternar1 {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;
        int vetciCislo = n1 > n2 ? n1 : n2;//vetsiCislo 10
        int mensiCislo = n1 > n2 ? n2 : n1;
        mensiCislo = n1 < n2 ? n1 : n2;

        int denVTydnu = 5;
        String msg = denVTydnu > 5 ? "Vikend" : "Prac. den";
        System.out.println(msg);
    }
}


