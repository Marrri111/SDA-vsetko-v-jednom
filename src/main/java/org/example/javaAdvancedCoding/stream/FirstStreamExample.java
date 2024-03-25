package org.example.javaAdvancedCoding.stream;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstStreamExample {
    public static void main(String[] args) throws IOException {
        Stream<Integer> streamOfInts = Arrays.asList(1, 2, 3).stream();
        streamOfInts.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 2;
            }
        }).forEach(a -> System.out.println(a));

        //let use lambda and method reference
        Arrays.asList(1, 2, 3).stream().filter(a -> a > 2).forEach(System.out::println);
        //************************************

        Stream<String> streamOfStrings = Set.of("one", "two", "three").stream();
        Stream<Map.Entry<String, Integer>> stream = Map.of("someKeyA", 1, "someKeyB", 2).entrySet().stream();
        IntStream arraysStream = Arrays.stream(new int[]{1, 2, 3});
        Stream<Double> ofStream = Stream.of(1.1, 2.2, 3.3);

        Stream<Integer> generateStream = Stream.generate(() -> new Random().nextInt()).limit(3);
        generateStream.forEach(System.out::println);

    }
}
