package org.example.javaAdvancedCoding.lambdas;

import java.util.function.Predicate;

public class MethodReference2 {

    public static void main(String[] args) {
        printIfPass("Ahoj", MethodReference2::checkStartWithR);

        //same as above
        printIfPass("Ahoj", new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return checkStartWithR(s);
            }
        });
    }

    static boolean checkStartWithR(String s) {
        return s.startsWith("R");
    }

    static void printIfPass(String s, Predicate<String> pr) {
        if (pr.test(s)) {
            System.out.println(s);
        }
    }
}
