package org.example.javaFundamentalsCoding.blok1.task5;

public class PrimeDefinition {
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // Kontrola dělitelnosti od 2 do odmocniny z čísla
        //začínam na dvojke, lebo to je prvé číslo, ktoré je prvočíslo
        //do druhej odmocniny z toho dvôvodu, že by to číslo bolo potom deliteľné nejakým iným číslom
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Číslo není prvočíslo
            }
        }
        return true; // Číslo je prvočíslo
    }
}
