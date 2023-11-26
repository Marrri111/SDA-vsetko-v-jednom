package org.example.javaFundamentals.november.stvrty;

public class ForLoop2 {
    public static void main(String[] args) {
        //write sum of first n number
        int n = 100;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
