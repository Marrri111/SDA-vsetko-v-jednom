package org.example.javaFundamentals.november.jedenasty;

public class Metods1 {
    public static void main(String[] args) {
        hello();
        greating("Vasku");
        greating("Kajo");
        String jmeno = "Vojto";//imagine from scenner;
        greating(jmeno);
        greating(String.valueOf(1));
        greating("ka"+"rle");

        printBalance(30, "Kc");
        printBalance(40, "eur");
    }

    static void hello(){

        System.out.println("Hello World");
    }
    static void greating(String name){

        System.out.println("Hello "+name);
    }
    static void printBalance(int amount, String currency){
        // 30 Kc
        //40 eur
        System.out.println(amount+" "+currency);
    }
}
