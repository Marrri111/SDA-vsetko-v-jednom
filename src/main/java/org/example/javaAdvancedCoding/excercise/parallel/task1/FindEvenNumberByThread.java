package org.example.javaAdvancedCoding.excercise.parallel.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class FindEvenNumberByThread {
    //Write a program that in parallel will nd even numbers in two intervals: 1000-
    //2000 and 14300-17800 .

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ArrayList<Integer> ret = new ArrayList<>();

        Thread thread1 = new Thread(() -> {
            List<Integer> evenNumber = findEvenNumber(1000, 2000);
            ret.addAll(evenNumber);
        });
        thread1.setPriority(3);
        Thread thread2 = new Thread(() -> {
            List<Integer> evenNumber = findEvenNumber(14300, 17800);
            ret.addAll(evenNumber);
        });

        thread1.start();
        thread2.start();
        //wait for end of threads
        thread1.join();
        thread2.join();
        ret.forEach(System.out::println);
    }


    public static List<Integer> findEvenNumber(int from, int to) {
        ArrayList<Integer> founded = new ArrayList<>();
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                founded.add(i);
            }
        }
        return founded;
    }
}
