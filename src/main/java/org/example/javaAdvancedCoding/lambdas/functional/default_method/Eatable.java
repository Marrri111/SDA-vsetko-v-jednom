package org.example.javaAdvancedCoding.lambdas.functional.default_method;

public interface Eatable {
    String whoAmI();

    default void eat() {
        System.out.println(whoAmI() + " eats");
    }
}
