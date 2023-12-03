package org.example.javaFundamentalsCoding.blok1.task4;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                //toto je najdôležitejšia podmienka, preto je hneď ako prvá
                //potom sa mi ani nebudú vypisovať ďalšie
                System.out.println("Fizz buzz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            }else if  (i % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
