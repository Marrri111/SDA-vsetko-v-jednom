package org.example.javaFundamentals.november.stvrty;

import java.util.Random;

public class WhileLoop2 {
    public static void main(String[] args) {
        Random r = new Random();
        boolean pesCural = r.nextBoolean();//vytvára mi náhodné hodnoty boolenu
        while (pesCural) {
            System.out.println("curej");
            pesCural = r.nextBoolean();
        }
        System.out.println("jdu domu");
    }
}
