package org.example.javaFundamentals.november.stvrty;

public class InnerLoop2 {
    public static void main(String[] args) {
        //write program for little children
        //generate examples from a to b as follow
        //a=1,
        //1+1=
        //1+2=...
        int a = 10;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(i + "+" + j + "=\t");
            }
            System.out.println();
        }
    }
}
