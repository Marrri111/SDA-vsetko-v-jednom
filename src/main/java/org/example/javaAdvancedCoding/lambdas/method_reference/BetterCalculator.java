package org.example.javaAdvancedCoding.lambdas.method_reference;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class BetterCalculator {
    public static void main(String[] args) {
        BetterCalculator bv = new BetterCalculator();

        bv.evaluate(5, SmartComputer::fact);

        int i = bv.evaluateAndDoSomething(5, (a) -> ++a, System.out::println);//i=6
    }

    int evaluate(int a, Function<Integer, Integer> op) {
        return op.apply(a);
    }

    int evaluateAndDoSomething(int a, Function<Integer, Integer> op, Consumer<String> ds) {
        Integer appliedA = op.apply(a);
        ds.accept(String.valueOf(appliedA));
        return appliedA;
    }

    public double evaluate(int a, int b, BiFunction<Integer, Integer, Double> op) {
        return op.apply(a, b);
    }

}
