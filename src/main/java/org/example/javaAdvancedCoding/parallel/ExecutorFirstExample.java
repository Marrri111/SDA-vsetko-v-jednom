package org.example.javaAdvancedCoding.parallel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorFirstExample {

    public static void main(String[] args) throws InterruptedException {
        final int cpus = Runtime.getRuntime().availableProcessors();
        final ExecutorService singleThreadES = Executors.newSingleThreadExecutor(); // single thread pool
        singleThreadES.submit(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                sleep(10);
            }
        });
        singleThreadES.submit(() -> {
            for (int i = 10; i < 20; i++) {
                System.out.println(i);
                sleep(10);
            }
        });
        final ExecutorService executorService = Executors.newFixedThreadPool(cpus); // pool with threads equal to cpu
        executorService.submit(() -> {
            for (int i = 20; i < 30; i++) {
                System.out.println(i);
                sleep(10);
            }
        });
        executorService.submit(() -> {
            for (int i = 30; i < 40; i++) {
                System.out.println(i);
                sleep(10);
            }
        });
        final ExecutorService cachedES = Executors.newCachedThreadPool();           // cached thread pool

        final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(cpus); // scheduled thread pool with cpu equal number of threads
        scheduledExecutorService.schedule(() -> System.out.println("ahoj"), 1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("repeat"), 1, 1, TimeUnit.SECONDS);
    }

    static void sleep(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {

        }
    }
}
