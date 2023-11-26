package org.example.javaFundamentals.november.piaty;

public class BubleSort {
    //zotriedi mi všetky prvky v poli
    public static void main(String[] args) {
        int[] ar = new int[]{3, 5, 8, 1, 4};
        int start = 0;
        //O(n)
        for (int p : ar) {
            System.out.print(p + ",");
        }
        System.out.println();
        //O (Ocko)
        //BubleSort
        //O(n*n)
        for (int j = 0; j < ar.length - 1; j++) {
            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] > ar[i + 1]) {
                    //switch two items
                    int tmp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = tmp;
                }
            }
        }
        //Arrays.sort(ar);
        //MergeSort, QuickSort, ShellSort O(n*logn)

        for (int p : ar) {
            System.out.print(p + ",");
        }
    }
}

