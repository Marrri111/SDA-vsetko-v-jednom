package org.example.javaFundamentals.november.dvanasty;

public class VarargsCalculator {
    public static void main(String[] args) {
        System.out.println(add(1, 1));
        System.out.println(add(35, 55, 200));
        System.out.println(add(1, 2, 3, 4, 5, 6));
        System.out.println(add(1, 2, 3, 4, 5, 6, 3, 3, 3, 3, 3, 3, 3, 3));
        printEachNewLine("ahoj", "jak");
        printEachNewLine("ahoj", "jak", "se");
        printEachNewLine("mas");
        // String.format("ahoj %s ja jsem %s","pepo","baba");
//        System.out.println(operation('+', 1,2,3));//6
//        System.out.println(operation('*', 2,2,3));//12
//        System.out.println(operation('-', 10,5,3));//2
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int... a) {//varargs
        //return a[0]+a[1].....
        int sum = 0;
        for (int prvek : a) {
            sum += prvek;
        }
        return sum;
    }

    public static void printEachNewLine(String... aaa) {
        for (String s : aaa) {
            System.out.println(s);
        }
    }

}
