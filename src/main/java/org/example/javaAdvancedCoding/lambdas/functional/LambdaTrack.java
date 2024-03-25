package org.example.javaAdvancedCoding.lambdas.functional;

import java.util.function.Predicate;

public class LambdaTrack {

    Predicate<Integer> testSizePredicate;

    public LambdaTrack(Predicate<Integer> testSizePredicate) {
        this.testSizePredicate = testSizePredicate;
    }

    void pickUp(int size) {
        if (!testSizePredicate.test(size)) {
            System.out.println("cannot pickup " + size);
        } else {
            System.out.println("picked " + size);
        }
    }


    public static void main(String[] args) {

        Predicate<Integer> smallPackagePred = new Predicate<>() {

            @Override
            public boolean test(Integer integer) {
                return integer < 20;
            }
        };

        LambdaTrack small = new LambdaTrack(smallPackagePred);
        small.pickUp(5);
        small.pickUp(30);

        LambdaTrack bigTrack = new LambdaTrack(size -> {
            System.out.println("testing " + size);
            return size < 100;
        });
        bigTrack.pickUp(300);

        LambdaTrack bigTrack2 = new LambdaTrack(size -> size < 100);
        bigTrack.pickUp(300);
    }
}
