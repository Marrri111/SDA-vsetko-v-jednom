package org.example.javaAdvancedCoding.parallel;

import java.util.ArrayList;
import java.util.List;

public class Join2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Generating data");
        Thread thread4 = new Thread(() -> {
            while (true) {
                System.out.print(".");
                sleep(1000);
            }

        });
        thread4.setDaemon(true);//main does not wait to end this thread

        thread4.start();
        List<Integer> data = new ArrayList<>();

        Thread thread = new Thread(() -> generateData(data));
        Thread thread2 = new Thread(() -> generateData(data));
        Thread thread3 = new Thread(() -> generateData(data));

        thread2.start();
        thread.start();
        thread3.start();

        thread2.join();
        thread3.join();
        thread.join();

        System.out.println(data.size());

    }

    static void generateData(List<Integer> integers) {

        for (int i = 0; i < 50; i++) {
            sleep(70);
            integers.add(i);
        }

    }

    static void sleep(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {

        }
    }
}
