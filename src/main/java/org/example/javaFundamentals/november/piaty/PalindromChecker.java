package org.example.javaFundamentals.november.piaty;

import java.util.Scanner;

public class PalindromChecker {
    public static void main(String[] args) {
        //aa aaa aca aabbaa
        //write program for check palindrom
        // not palindrom abnc
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("stop")) {
                break;
            }
            boolean isSame = true;
            //true && true && false = false
            //if line is palindrom write true, otherwise false
            int pocetKroku = 0;
            for (int i = 0; i < line.length() / 2; i++) {
                //abcddcba
                pocetKroku++;
                char c = line.charAt(i);
                char c1 = line.charAt(line.length() - i - 1);
//                boolean isSameChar = c == c1;
//                isSame = isSame && isSameChar;
                isSame &= c == c1;
                if (!isSame) {//isSame == false
                    break;
                }
            }
            System.out.println(isSame);
            System.out.println(pocetKroku);
        }
    }
}