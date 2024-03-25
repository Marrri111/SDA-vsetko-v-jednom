package org.example.javaAdvancedCoding.parallel;

public class ThreadsVariable {
    //if variable are used in thread should be volatile
    volatile int a = 0;

    public static void main(String[] args) {
        ThreadsVariable threadsVariable = new ThreadsVariable();
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {

                System.out.println("Thread1");
                try {
                    threadsVariable.incrementAndPrint();
                } catch (InterruptedException e) {

                }
            }
        });
        Thread thread2 = new Thread(() -> {

            for (int i = 0; i < 10; i++) {
                System.out.println("Thread2");
                try {
                    threadsVariable.incrementAndPrint();
                } catch (InterruptedException e) {

                }
            }
        });

        thread.start();
        thread2.start();
    }

    synchronized void incrementAndPrint() throws InterruptedException {

        a += 1;
        System.out.println(a);

    }

}
