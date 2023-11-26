package org.example.javaFundamentals.november.piaty;

import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
        //write program to encode input from user to morse code input is only chars a..z, other chars
        //skip


        String[] morseCode = {
                ".-",    // a
                "-...",  // b
                "-.-.",  // c
                "-..",   // d
                ".",     // e
                "..-.",  // f
                "--.",   // g
                "....",  // h
                "..",    // i
                ".---",  // j
                "-.-",   // k
                ".-..",  // l
                "--",    // m
                "-.",    // n
                "---",   // o
                ".--.",  // p
                "--.-",  // q
                ".-.",   // r
                "...",   // s
                "-",     // t
                "..-",   // u
                "...-",  // v
                ".--",   // w
                "-..-",  // x
                "-.--",  // y
                "--..",  // z
        };
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        for (int i = 0; i < line.length(); i++) {
            //abhoj
            char c = line.charAt(i);
            int index = c - 97;
            if (index < 0 || index > morseCode.length - i) {
                continue;
            }
            System.out.print(morseCode[index] + "\t");
        }
    }
}
