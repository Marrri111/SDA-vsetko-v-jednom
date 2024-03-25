package org.example.jDBCandHibernate.jdbc.example.procvicovaniZCviceni;

public class Method0 {
    public static void main(String[] args) {
        hello();

        greating("Vašek");
        greating("Adél");

        String jmeno = "Vojto";
        greating(jmeno);

        greating(String.valueOf(1));

        greating("Ka" + "rle");

    }

    static void hello() {
        System.out.println("Hello World");

    }

    static void greating(String name) {
        System.out.println("Hello " + name);
    }

}
