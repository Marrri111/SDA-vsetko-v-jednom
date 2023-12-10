package org.example.javaFundamentalsCoding.blok4.hw2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter messages until they say "stop"
        System.out.println("Piš slova. Napiš 'stop' pro konec:");
        String userInput;

        SentenceBuilder sentenceBuilder = new SentenceBuilder();

        do {
            userInput = scanner.nextLine();

            if (!userInput.equalsIgnoreCase("stop")) {
                sentenceBuilder.appendWord(userInput);
            }

        } while (!userInput.equalsIgnoreCase("stop"));

        scanner.close();

        sentenceBuilder.finishSentence();

        String result = sentenceBuilder.getSentence();
        System.out.println("Celá věta: " + result);

    }

}
