package org.example.javaFundamentals.cvicenia;

import java.util.Random;

public class PrikladyPreDeti {
    public static void main(String[] args) {
        Random r = new Random();

        int a = 10;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                int choise = r.nextInt(1, 4);
                switch (choise) {
                    case 1:
                        System.out.print(i + " + " + "_ " + "= " + (i + j) + "\t\t");
                        break;
                    case 2:
                        System.out.print("_" + " + " + j + " = " + (i + j) + "\t\t");
                        break;
                    case 3:
                        System.out.print(i + " + " + j + " = " + "_" + "\t\t");
                }
            }
            System.out.println();
        }

    }
}
