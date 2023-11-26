package org.example.javaFundamentals.november.piaty;

public class NullExplanation {
    public static void main(String[] args) {
        String s1 = "";//regular string(object) can call it methods
        int length = s1.length();

        String s2 = null;//null object, we cannot call methods
        s2.length();//throws NullPointerException (error)
        s2 = "ahoj";
    }
}
