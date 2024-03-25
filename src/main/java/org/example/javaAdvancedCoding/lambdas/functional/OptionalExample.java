package org.example.javaAdvancedCoding.lambdas.functional;

import java.util.Optional;

public class OptionalExample {

    int findEmoployeeSalary(String name) {
        //imagine code that find in db
        if (name == "karel") {
            return 200000;
        }
        //worst approach
        return -1;

        //posibility
        //throw new SomeException().....
    }

    Optional<Integer> findEmoployeeSalaryBetter(String name) {
        //imagine code that find in db
        if (name == "karel") {
            return Optional.of(200000);
        } else {
            return Optional.empty();
        }

    }

    public static void main(String[] args) {
        String name = "tonda";
        OptionalExample oe = new OptionalExample();
        System.out.println("salary for " + name + " is " + oe.findEmoployeeSalary(name));

        Optional<Integer> tondaSalary = oe.findEmoployeeSalaryBetter("tonda");
        System.out.println("salary for " + name + " is " + (tondaSalary.isPresent() ? tondaSalary.get() : "no record found"));

        tondaSalary.ifPresent(salary -> System.out.println(" salary is " + salary));
        //or same
        tondaSalary.ifPresent(System.out::println);
    }
}
