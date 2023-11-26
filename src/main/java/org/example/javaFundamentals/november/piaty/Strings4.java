package org.example.javaFundamentals.november.piaty;

public class Strings4 {
    public static void main(String[] args) {
        String s = "Ahoj jak se máš?";
        String[] split = s.split(" ");//rozdelenie stringu na pole stringov
        //v príklade sme si uviedli to, že oddeľovačom bude meedzera
        String[] numbers = "1,2,3,4,5".split(",");
        String cisla = "1982";
        String[] split1 = cisla.split("");
    }
}
