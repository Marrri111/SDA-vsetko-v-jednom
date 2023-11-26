package org.example.javaFundamentals.november.piaty;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        //generate array of int of n length with random value from 2 to 20 and print it in
        //this format {n1, n2, n3}
        int n = 30;
        int[] intArray = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            intArray[i] = random.nextInt(2, 21);
        }
        System.out.print("{");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(intArray[i] + ",");
        }
        System.out.print(intArray[n - 1]);

        System.out.println("}");
    }
}
