package org.example.javaAdvancedCoding.excercise.generic;

import java.util.Arrays;

public class Task3 {
    //Design the generic swap method, which will be responsible for swapping the
    //position of the selected elements of the array.
    //Navrhnite generickú swapovú metódu, ktorá bude zodpovedná za výmenu
    //polohu vybraných prvkov poľa.
    public static void main(String[] args) {
        Integer[] pole01 = swap(5, 2, 1, 54, 35, 98, 65, 77, 88);
        Arrays.stream(pole01).forEach(System.out::println);
        String[] poleStringov = swap(0, 1, "a", "b");
        Arrays.stream(poleStringov).forEach(System.out::println);


    }

    public static <T> T[] swap(int x, int y, T... pole) {
        T tmp = pole[x];
        pole[x] = pole[y];
        pole[y] = tmp;
        return pole;
    }
}
