package org.example.javaFundamentalsCoding.blok2.task12;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

import static java.lang.Character.isSpaceChar;

public class SpaceCharacter {
    public void calculateSpacePercentage() {
        Scanner scanner = new Scanner(System.in);
        int letter = 0;
        int space = 0;
        double percentage = 0;
        while (true) {//this is infinitive cycle
            System.out.print("Enter a text (type 'Enough' to stop): ");
            String text = scanner.nextLine(); //using scanner to introduce variable text

            if (text.equalsIgnoreCase("Enough")) {//if user enter enough! infinite cycle breaks
                break;//ignoreCase user can enter this word at any letter case
            }
            for (int i = 0; i < text.length(); i++) {

                if (!Character.isSpaceChar(text.charAt(i))) {//it compares character on position i from text
                    letter++;
                } else {
                    space++;
                }
                percentage = (100.0 * space) / (letter + space);
            }
            System.out.println(percentage);
        }
        scanner.close();
    }
}
