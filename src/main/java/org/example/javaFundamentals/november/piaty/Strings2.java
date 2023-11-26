package org.example.javaFundamentals.november.piaty;

public class Strings2 {
    public static void main(String[] args) {
        //porovnávanie pri objektoch mi porovnáva, či je to skutočne ten istý objekt alebo nie
        //znamená to to, že s1 a s2 aj keď majú rovnakú hodnotu sú to dve objekty, napr ako dvaja ľudia s rovnakými menami
        //a keď sme do s3 dali hodnotu s1, tak je to ten istý objekt
        int a = 5;
        int b = 5;
        System.out.println(a == b);
        String s1 = "ahoj";
        String s2 = new String("ahoj");
        String s3 = s1;
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
        System.out.println(s1 == s3);//true

        String sh = "hello";
        String sh2 = "hello";
        System.out.println(sh.intern() == sh2.intern());
    }
}
