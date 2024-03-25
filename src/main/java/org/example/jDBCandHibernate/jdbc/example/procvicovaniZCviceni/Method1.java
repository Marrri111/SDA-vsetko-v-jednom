package org.example.jDBCandHibernate.jdbc.example.procvicovaniZCviceni;

public class Method1 {
    public static void main(String[] args) {
        printBalances();

        System.out.println();

        printBalances1(30, "Kč");
        printBalances1(40, "eur");


    }


    static void printBalances() {
        // 30 kč
        // 40 eur
        System.out.println("30 Kč");
        System.out.println("40 eur");
    }

    static void printBalances1(int amount, String currency) {
        // 30 kč
        // 40 eur
        System.out.println(amount + " " + currency);
    }


}
