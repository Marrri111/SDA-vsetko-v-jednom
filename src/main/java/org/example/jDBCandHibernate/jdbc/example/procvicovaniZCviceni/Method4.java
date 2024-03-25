package org.example.jDBCandHibernate.jdbc.example.procvicovaniZCviceni;

public class Method4 {
    public static void main(String[] args) {
        System.out.println(lesssNumber(10));  //will print 8
        System.out.println(lesssNumber(9));  //will print 7


    }

    static int lesssNumber(int a) {
        return a - 2;
    }
}
