package org.example.javaFundamentals.november.dvanasty;

public class BinarySearch {
    static int[] pole = new int[]{2, 7, 8, 12, 44, 65, 80, 100, 120, 160, 300};

    public static void main(String[] args) {
        int hledany = 160;
        for (int i = 0; i < pole.length; i++) {
            if (hledany == pole[i]) {
                System.out.println(i);
            }
        }
        System.out.println(binarySearch(pole, 160, 0, pole.length));
        System.out.println(binarySearch(pole, 8, 0, pole.length));
        System.out.println(binarySearch(pole, 150, 0, pole.length));
    }

    static int binarySearch(int[] pole, int hledany, int leftIndex, int rightIndex) {
        int median = ((rightIndex - leftIndex) / 2) + leftIndex;
        if(leftIndex > rightIndex | leftIndex < 0){
            return -1;
        }
        if (pole[median] == hledany) {
            return median;
        }
        if( hledany < pole[median] ){
            return  binarySearch(pole, hledany, leftIndex, median -1 );
        }
        else {
            //je mensi
            return binarySearch(pole, hledany, median + 1, rightIndex);
        }

    }
}
