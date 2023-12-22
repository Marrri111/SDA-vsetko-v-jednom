package org.example.cvicenia.loops;


public class FourteenthExercise {
    public static void main(String[] args) {
        int variable = 10;
        for (int i = 0; i < variable; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

