package org.example.javaFundamentals.november.piaty;

public class Strings1 {
    public static void main(String[] args) {
        String s1 = " ahoj";
        String s2 = " Ahoj";
        String s3 = " hello";
        String s4 = s1 + s3;
        s4 += " konec";
        System.out.println(s4);
        String s5 = new String(" novy");
        System.out.println(s5.length());
        System.out.println(s5.toUpperCase());
        System.out.println(s5);
    }
}
