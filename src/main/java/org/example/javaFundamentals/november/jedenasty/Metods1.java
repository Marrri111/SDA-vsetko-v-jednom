package org.example.javaFundamentals.november.jedenasty;

public class Metods1 {
    public static void main(String[] args) {
        greeting();
        pozdrav("Vasku");
        pozdrav("Kajo");
        String jmeno = "Vojto";
        pozdrav(jmeno);
        pozdrav("Kar" + "le");
        printBalance(30, "Kc");
        printBalance(40, "Eur");
    }

    static void greeting() {
        System.out.println("Hello world.");
    }

    static void pozdrav(String name) {
        System.out.println("Hello " + name);
    }

    static void printBalance(int amount, String currency) {
        System.out.println(amount + " " + currency);
    }
}
