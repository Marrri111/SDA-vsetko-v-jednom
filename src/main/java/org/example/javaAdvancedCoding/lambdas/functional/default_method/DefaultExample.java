package org.example.javaAdvancedCoding.lambdas.functional.default_method;

import java.util.List;

public class DefaultExample {
    public static void main(String[] args) {
        Eatable human = new Human();
        Eatable elephant = new Elephant();

        human.eat();
        elephant.eat();

        Eatable et = () -> "Im ET";
        et.eat();


        List<String> names = List.of("karel", "jana", "pavla");
        // names.add("karel"); will throw ImutableListException
        //..
        //..
        names.forEach(item -> System.out.println(item));
        //same
        names.forEach(System.out::println);
    }
}
