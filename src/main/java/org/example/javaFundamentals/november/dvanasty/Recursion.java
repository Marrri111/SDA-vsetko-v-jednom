package org.example.javaFundamentals.november.dvanasty;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factRec(6));
        int i = inc(5);
        System.out.println();
    }

    static int fact(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static int factRec(int n) {

        //4! = 1*2*3*4
        //3! = 1*2*3
        //4! = 3!*4
        //3!= 2!*3
        //2! = 1!*2
        //1! = 1;
        //n! = (n-1)!*n
        if (n == 1) {//kazda rekurze musi v urcite chvili koncit
            return 1;
        }
        int nMinus1Fact = factRec(n - 1);

        int ret = nMinus1Fact * n;
        System.out.println(n + "! =" + ret);
        return ret;
    }

    static int factRecNice(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factRecNice(n - 1) * n;
        }
    }

    static int factRecVeryNice(int n) {//toto je zapísané pomocou ternaru
        return (n == 1) ? 1 : factRecNice(n - 1) * n;
        // if (n == 1) {
        // return 1;
        // } else {
        // return factRecNice(n - 1) * n;
        // }
    }

    static int inc(int n) {
        return n + 1;
    }
}//skončila som na 0h 42m
