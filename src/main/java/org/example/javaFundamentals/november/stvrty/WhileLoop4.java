package org.example.javaFundamentals.november.stvrty;

import java.util.Scanner;

public class WhileLoop4 {
    public static void main(String[] args) {
        //write program for compute average of students grades
        //read grade by grade from in(vstup) after user enters grade 0
        //print average
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadavaj hodnotenie 0 pre ukoncenie");
        String readedLine = "";//vstup používateľa
        int sumGrades = 0;
        int countGrades = 0;

        while (!readedLine.equals("0")) {//pokiaľ readline sa nerovná nule, bude sa robiť telo while
            readedLine = scanner.nextLine();
            System.out.println("Zadaj znamku");
            countGrades++;
            sumGrades = sumGrades + Integer.parseInt(readedLine);//integer.parseInt ????
        }
        System.out.println("User enters " + (countGrades - 1) + " grades with avg = " + sumGrades / (countGrades - 1.0));

    }
}
