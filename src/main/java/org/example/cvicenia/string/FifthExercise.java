package org.example.cvicenia.string;

public class FifthExercise {
    public static void main(String[] args) {

        String string1 = "First string";
        String string2 = "Second string";
        String string3 = "Third string";
        String string4 = string1 + string2 + string3;
        String string5 = string1.concat(string2).concat(string3);//concatenates je spájanie
        System.out.println(string4);
        System.out.println(string5);
    }
}
