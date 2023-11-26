package org.example.javaFundamentals.november.stvrty;

public class ForLoop4 {
    public static void main(String[] args) {
        //write program for compute n!
        int n = 10;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
