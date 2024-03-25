package org.example.javaAdvancedCoding.parallel;

public class ThreadsExample {
    public static void main(String[] args) {
        PrintNumberInThread oddNumbers = new PrintNumberInThread(true);
        PrintNumberInThread evenNumbers = new PrintNumberInThread(false);

        oddNumbers.start();
        evenNumbers.start();

        System.out.println("***************runnable*********************");
        PrintNumberInRunnable printNumberInRunnable = new PrintNumberInRunnable(true);
        Thread thread = new Thread(printNumberInRunnable);
        thread.start();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " from runnable");
                }
            }
        });

        thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {

                }
                System.out.println(i + " from lambda");
            }
        });
        thread2.start();

    }
}
