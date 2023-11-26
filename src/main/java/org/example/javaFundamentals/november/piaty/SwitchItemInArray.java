package org.example.javaFundamentals.november.piaty;

public class SwitchItemInArray {
    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 3};
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
        for (int a : array) {
            System.out.println(a);
        }
    }
}
