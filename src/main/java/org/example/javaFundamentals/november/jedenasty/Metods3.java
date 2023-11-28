package org.example.javaFundamentals.november.jedenasty;

public class Metods3 {
    public static void main(String[] args) {
        System.out.println(inc(inc(1)));//vypíšem hodnotu increment z incrementu 1
        System.out.println(add(2,inc(1)));
        System.out.println(div(10,3,true));
        System.out.println(div(10,3,false));
    }
    static int inc(int i){
        return ++i;
    }
    static int add(int a, int b){
        return a+b;
    }
    static double div(int a, int b, boolean interegDev){
        if (interegDev){
            return a/b;
        }
        else {
            return (double) a/b;
        }
    }//vo videu som skončila na 1h 24m
}
