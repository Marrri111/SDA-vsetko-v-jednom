package org.example.javaFundamentals.oktober.dvadsiatydruhy;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b;
        b = 10;
        a = a + 1;
        a += 1; //tento operátor += robí to isté ako predchádzajúci riadok
        b -= a;
        b *= a;
        System.out.println(b);
        b /= 3;
        System.out.println(a / 2); //celočíselné delenie, výsledok bude 2
        System.out.println(a % 2); //vypočítava sa zbytok po delení

    }
}
