package org.example.javaFundamentals.november.jedenasty;

public class MetodsTask1 {
    public static void main(String[] args) {
        System.out.println(lessNumber(10));//will print 8
        System.out.println(lessNumber(9));//will print7
        System.out.println(abs(0));
        System.out.println(abs(-10));
        System.out.println(abs(3));
    }

    static int lessNumber(int a) {

        return a - 2;
    }

    static int abs(int b) {//absolútna hodnota
        if (b > 0) {
            return b;
        }
        if (b < 0) {
            return b * (-1);
        }
        else {
            return 0;
        }
    }
}
