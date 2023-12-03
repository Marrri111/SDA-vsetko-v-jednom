package org.example.javaFundamentalsCoding.blok2.task11;

import java.util.Scanner;

public class LongestTextFinder {
    public String findLongestText() { //metóda
        String longestText = ""; // Initialize with an empty string
        Scanner scanner = new Scanner(System.in);

        // Read texts until the user enters "Enough!"
        while (true) {//this is infinitive cycle
            System.out.print("Enter a text (type 'Enough!' to stop): ");
            String text = scanner.nextLine(); //using scanner to introduce variable text

            if (text.equalsIgnoreCase("Enough!")) {//if user enter enough! infinite cycle breaks
                break;//ignoreCase user can enter this word at any letter case
            }

            // Update the longestText if the current text is longer
            if (text.length() > longestText.length()) { //if user enter text, which is longer than longest text(i gave him
                //empty, i gave my text to longest text
                longestText = text;
            }
        }
        // Close the scanner, close scanner as soon as possible(when i dont need it)
        scanner.close();

        // Check if any text was provided
        if (!longestText.isEmpty()) {
            System.out.println("The longest text is: " + longestText);
        } else {
            System.out.println("No text provided");
        }


        return longestText;
    }
}
