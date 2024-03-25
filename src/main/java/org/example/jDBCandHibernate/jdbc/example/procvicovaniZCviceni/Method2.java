package org.example.jDBCandHibernate.jdbc.example.procvicovaniZCviceni;

import java.util.Random;

public class Method2 {
    public static void main(String[] args) {
        System.out.println(10 % 3);

        int aaa = rest(10, 3);
        System.out.println(aaa);

        System.out.println();

        System.out.println(random());

        System.out.println();

        int del = 3;
        int delen = 2;
        int vysledek = rest(del, delen);
        System.out.println(vysledek);
    }

    static int random() {
        int i = new Random().nextInt();
        return i;
    }


    // s dvěmi argumenty
    static int rest(int delenec, int delitel) {
        int r = delenec % delitel;
        return r;
    }
}
