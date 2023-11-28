package org.example.javaFundamentals.november.jedenasty;

public class MetodsTask2 {
    public static void main(String[] args) {
        System.out.println(pow2(2));//4, druhá mocnina
        System.out.println(pow(2, 3));//8, tretia mocnina
        System.out.println(printArray(new int[]{1, -2, 3}));//[1, 2, 3]
    }

    static int pow2(int a) {
        return a * a;
    }

    static int pow(int a, int b) {
        int x = 1;
        for (int i = 0; i < b; i++) {
            x = x * a;
        }
        return x;
    }

    static String printArray(int[] a) {
        String asd = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                asd += a[i] * -1;
            } else {
                asd += a[i];
            }
            if (i != a.length - 1) {
                asd += ",";
            }
        }
        return "[" + asd + "]";
    }
}//na videu som skončila 3h 32m
