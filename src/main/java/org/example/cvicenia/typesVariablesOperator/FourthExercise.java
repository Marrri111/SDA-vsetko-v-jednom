package org.example.cvicenia.typesVariablesOperator;

public class FourthExercise {
    public static void main(String[] args) {
        int intVar1 = 2;
        int intVar2 = 3;
        short shortSum = (short) (intVar1 + intVar2);
        System.out.println(shortSum);
        System.out.println(shortSum++);
        byte byteSum = (byte) (intVar1 + intVar2);
        System.out.println(byteSum);
        System.out.println(++byteSum);
    }
}
