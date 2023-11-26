package org.example.javaFundamentals.november.stvrty;

public class ForLoop3 {
    public static void main(String[] args) {
        //write program counting odd numbers for n
        int n = 100;
        int oddNumbersCount = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                oddNumbersCount++;
            }
        }
        System.out.println(oddNumbersCount);
    }
    //na videu som skončila na 0h 58m
}
