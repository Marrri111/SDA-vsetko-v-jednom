package org.example.javaFundamentals.november.piaty;

public class Array2 {
    public static void main(String[] args) {
        int[] a = new int[]{3, 4, 6, 7, 9};

        for (int i = 0; i < a.length; i++) {
            System.out.println("Na indexu " + i + " je: " + a[i]);
        }
        System.out.println();
        for (int prvek : a) {//in array a go throught all item, each item store in variable prvek
            System.out.println(prvek);
        }

    }
}
