package org.example.javaFundamentals.november.jedenasty;

import java.util.Random;

public class Metods2 {
    public static void main(String[] args) {
        System.out.println(10 % 3);
        int aaa = rest(13, 3);
        System.out.println(aaa);
        System.out.println(random());
        int del = 3;
        int d = 2;
        int vys = rest(del, d);
        System.out.println(div(3, 2));
    }

    static int random() {
        int i = new Random().nextInt(1, 5);
        return i;
    }

    static int rest(int delenec, int delitel) {
        int r = delenec % delitel;
        return r;
    }

    static double div(int a, int b) {
        return (double) a / b;
    }
}

