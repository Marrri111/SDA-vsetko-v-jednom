package org.example.javaAdvancedCoding.lambdas.method_reference;

import advanced.lambdas.cz11_lambda_intruduce.Calculator;

import java.util.function.Function;

public class SmartComputer {
    public static void main(String[] args) {
        System.out.println(fact(2));
        Calculator smartC = new Calculator();
        int absValue = smartC.evaluate(-1, (a) -> Math.abs(a));
//***********for static method******************
        //lambda with call to static method
        smartC.evaluate(5, (a) -> SmartComputer.fact(a));

        //method reference
        Calculator.SingleOperation so = SmartComputer::fact;
        Function<Integer, Integer> factFunc = SmartComputer::fact;
        smartC.evaluate(5, so);

        //sorter approach
        smartC.evaluate(5, SmartComputer::fact);

        //******************for instance method**************
        SmartComputer sc = new SmartComputer();
        smartC.evaluate(-5, sc::abs);
        //same as above
        smartC.evaluate(-5, (a) -> fact(a));

        //aother approach
        smartC.evaluate(-5, new SmartComputer()::abs);
    }

    public static int fact(int n) {
        int i = n < 3 ? n : n * fact(n - 1);
        return i;
    }

    public int abs(int a) {
        return a < 0 ? -a : a;
    }
}
