package org.example.javaAdvancedCoding.parallel;

import java.time.LocalDateTime;

public class Join {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(LocalDateTime.now());
                sleep(500);
            }

        });
        thread.start();
        sleep(200);
        thread.join();
        System.out.println("Vypsano 10x");

    }

    static void sleep(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {

        }
    }
}
