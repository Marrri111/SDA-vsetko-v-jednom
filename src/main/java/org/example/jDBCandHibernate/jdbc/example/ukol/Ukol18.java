package org.example.jDBCandHibernate.jdbc.example.ukol;

public class Ukol18 {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        /* Vytvoření dvourozměrného pole (matici ) tab s rozmery a x b */
        int[][] tab = new int[a][b];
        int val = 0;    // k plnění matice

        /* Naplnění matice hodnotami od 0 do (a*b -1) */
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                tab[i][j] = val++;
            }
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.println("tab[" + i + "," + j + "]=" + tab[i][j] + ";");
            }
            System.out.println();
        }


    }
}
