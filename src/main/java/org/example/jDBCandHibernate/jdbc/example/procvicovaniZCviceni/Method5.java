package org.example.jDBCandHibernate.jdbc.example.procvicovaniZCviceni;

public class Method5 {
    public static void main(String[] args) {
        System.out.println(abs(-3));

    }

    static int abs(int a) {
        if (a >= 0) {
            return a;
        } else {
            return a * -1;
        }
    }
}
