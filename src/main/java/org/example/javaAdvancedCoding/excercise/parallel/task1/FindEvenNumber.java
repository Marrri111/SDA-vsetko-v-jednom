package org.example.javaAdvancedCoding.excercise.parallel.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FindEvenNumber {
    //Write a program that in parallel will nd even numbers in two intervals: 1000-
    //2000 and 14300-17800 .

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<List<Integer>> even1 = executorService.submit(() -> findEvenNumber(1000, 2000));
        Future<List<Integer>> even2 = executorService.submit(() -> findEvenNumber(14300, 17800));

        List<Integer> integers = even1.get();
        List<Integer> integers1 = even2.get();

        integers.forEach(System.out::println);
        integers1.forEach(System.out::println);
//        ArrayList<Integer> allNumbers = new ArrayList<>();
//        allNumbers.addAll(integers);
//        allNumbers.addAll(integers1);
//        Optional<String> reduce = allNumbers.stream()
//                .map(i -> String.valueOf(i))
//                .reduce((i, j) -> String.format("%s, %s", i, j));
//
//        reduce.ifPresent(System.out::println);
        executorService.shutdown();
    }

    public static List<Integer> findEvenNumber(int from, int to) throws InterruptedException {
        ArrayList<Integer> founded = new ArrayList<>();
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                founded.add(i);
            }
            //sleep curren thread
            Thread.sleep(5);
        }

        return founded;
    }
}
