package org.example.javaAdvancedCoding.lambdas.cz11_lambda_intruduce;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int evaluate = calculator.evaluate(1, 1, new PlusOperation());//2

        //nasleduje stejne reseni pomoci anonymni tridy
        int evaluate1 = calculator.evaluate(1, 1, new Operation() {
            @Override
            public int eval(int a, int b) {
                return a - b;
            }
        });//0

        //stejne reseni pomoci lambdy
        calculator.evaluate(1, 1, (a, b) -> a * b);

        //labda with body
        calculator.evaluate(1, 1, (a, b) -> {
            System.out.println("Scitam cisla");
            return a + b;
        });//same as line 6


        Operation divOperation = (a, b) -> a / b;

        calculator.evaluate(2, 1, divOperation);

        String op = "+";
        switch (op) {
            case "+" -> System.out.println("plus");//neni lambda shoda okolnosti, znaku
        }

    }

    public int evaluate(int a, int b, Operation op) {
        return op.eval(a, b);
    }

    public int evaluate(int a, SingleOperation op) {
        return op.eval(a);
    }

    public interface SingleOperation {
        int eval(int a);

    }

    interface Operation {
        int eval(int a, int b);

    }

    static class PlusOperation implements Operation {

        @Override
        public int eval(int a, int b) {
            return a + b;
        }
    }
}
