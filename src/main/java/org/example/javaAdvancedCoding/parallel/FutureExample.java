package org.example.javaAdvancedCoding.parallel;

import java.util.Optional;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                return thread;
            }
        });


        Future<String> submit = executorService.submit(() -> {
            System.out.println("Retreving");
            //i.e retrive data from db
            //...retrieving
            Thread.sleep(2000);
            return "data";
        });

        System.out.println(submit.get());

        Future<Optional<Integer>> sum = executorService.submit(() -> {
            int[] i = new int[1];
            return Stream.generate(() -> i[0]++).limit(500).reduce((i1, i2) -> i1 + i2);
        });
        System.out.println(sum.get());

        executorService.submit(() -> {
            while (true) ;
        });
        executorService.shutdown();
    }
}
