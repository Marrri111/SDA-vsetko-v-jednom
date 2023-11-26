package org.example.javaFundamentals.cvicenia;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sportka {

    static Random r = new Random();
    public static void main(String[] args) {
        //napiste program ktery vygeneruje nahodna cisla z 1-49 (ulozte do pole) celkem 5 kousku
        //nechte uzivatele vsadit 5 cisel a vypiste mu poradi vyhry/prohra

        int[] los = randomNumbers();


//1. cast programu
        //   int[] vsazeno = zadejSazku();
//        int poradi = checkSazka(los, vsazeno);
//        System.out.println(poradi > 0 ? "Vyhral jsi " + poradi + " misto." : "Nevyhral jsi");
//        printArray(los);

        // 1. vsechny
        //2. 4
        //3. 3
        //4. 2

        int xPoradi = 3;
        int pocetPokusu = 0;
        while (true) {
            pocetPokusu++;
            int[] vsazenoNahodne = randomNumbers();
            int poradiVyhry = checkSazka(los, vsazenoNahodne);
            if (poradiVyhry == xPoradi) {
                System.out.println("vsazeno");
                printArray(vsazenoNahodne);
                break;
            }
        }
        System.out.println();
        System.out.println("losovano");
        Arrays.toString(los);

        System.out.println();

        System.out.println();
        System.out.println(xPoradi + " . cena uhadnuta na " + pocetPokusu + " pokus");

        //zkuste simulovat sazky, v cyklu budete generovat sazky (vygenerujete 5 cisel za uzivatele) a
        //zkontrolujete jestli dosahl x-teho poradi, vypiste pocet pokusu ktere byli potreba pro dosazeni x-te vyhry
    }

    private static int checkSazka(int[] los, int[] vsazeno) {
        int uhodnouto = 0;
        for (int vsazenoCislo : vsazeno) {
            if (contain(los, vsazenoCislo)) {
                uhodnouto++;
            }
        }
        return switch (uhodnouto) {
            case 5 -> 1;
            case 4 -> 2;
            case 3 -> 3;
            case 2 -> 4;
            default -> -1;
        };
    }

    private static int[] zadejSazku() {
        Scanner s = new Scanner(System.in);
        System.out.println("zadej 5 cisel oddelenych  mezerou");
        String[] split = s.nextLine().split(" ");
        int[] ints = new int[5];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(split[i]);
        }

        return ints;
    }

    public static int[] randomNumbers() {
        int[] ret = new int[5];
        for (int i = 0; i < ret.length; i++) {
            while (true) {
                int random = r.nextInt(1, 50);
                if (!contain(ret, random)) {
                    ret[i] = random;
                    break;
                }
            }
        }
        return ret;
    }

    public static int[] randomNumbers2() {
        int[] ret = new int[5];
        for (int i = 0; i < ret.length; i++) {
            int random = r.nextInt(1, 50);
            if (contain(ret, random)) {
                i--;//ret contains number, lets try it again
            } else {
                ret[i] = random;
            }
        }
        return ret;
    }

    private static boolean contain(int[] p, int number) {
        for (int i : p) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }

    private static void printArray(int[] a) {
        for (int c : a) {
            System.out.print(c + " ");
        }
    }
}

