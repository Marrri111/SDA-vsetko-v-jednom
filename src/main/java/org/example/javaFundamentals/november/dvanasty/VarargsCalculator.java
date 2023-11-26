package org.example.javaFundamentals.november.dvanasty;

public class VarargsCalculator {
    public static void main(String[] args) {
        System.out.println(add(1, 1));
        System.out.println(add(35, 55, 200));
        System.out.println(add(1, 2, 3, 4, 5, 6));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int... a) {
        //return a[0]+a[1]....
        int sum = 0;
        for (int prvek : a) {
            sum += prvek;
        }
        return sum;
    }
}