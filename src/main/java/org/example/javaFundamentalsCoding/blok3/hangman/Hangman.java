package org.example.javaFundamentalsCoding.blok3.hangman;

import java.util.Random;
import java.util.Scanner;

public class Hangman {

    private char[] guessedWords;

    private int numberOfLivesLeft = 3;

    private String[] wordStack = {"michal", "auto", "kolo", "trevor", "kolotoc", "jmeno"};

    private String randomWord;

    public void initializeGame() {
        System.out.println("Vitej ve hre hangman, uhadni slovo!");

        randomWord = getRandomWord();

        guessedWords = new char[randomWord.length()];

        for (int i = 0; i < randomWord.length(); ++i) {
            guessedWords[i] = '_';
        }
    }

    private void lose() {
        System.out.println("You lost! The word was: " + randomWord);
        System.exit(2);
    }

    private void win() {
        System.out.println("You win! The word was: " + randomWord);
        System.exit(1);
    }

    private void printGameStatus() {
        for (int i = 0; i < randomWord.length(); ++i) {
            System.out.print(guessedWords[i] + " ");
        }
        System.out.println();
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (numberOfLivesLeft == 0) {
                lose();
            }

            printGameStatus();

            System.out.println("Hadej pismeno: ");
            char letter = scanner.next().charAt(0);

            boolean guessed = false;

            for (int i = 0; i < randomWord.length(); ++i) {
                if (letter == randomWord.charAt(i)) {
                    guessedWords[i] = letter;
                    guessed = true;
                }
            }

            if (!guessed) {
                wrongGuess();
            }

            if (isGameWon()) {
                win();
            }
        }
    }

    private void wrongGuess() {
        System.out.println("Wrong guess!");
        numberOfLivesLeft--;
    }

    private boolean isGameWon() {
        return new String(guessedWords).equals(randomWord);
    }

    public String getRandomWord() {
        Random random = new Random();
        int randomNumber = random.nextInt(0, 6);
        String word = wordStack[randomNumber];
        return word;
    }


}
