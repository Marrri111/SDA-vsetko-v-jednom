package org.example.javaAdvancedCoding.parallel;

public class PrintNumberInThread extends Thread {
    boolean odd;

    public PrintNumberInThread(boolean odd) {
        this.odd = odd;
    }

    @Override
    public void run() {
        try {
            print();
        } catch (InterruptedException e) {

        }
    }

    public void print() throws InterruptedException {

        for (int i = 0; i < 20; i++) {
            Thread.sleep(500);
            if (odd) {
                if (i % 2 != 0) {
                    System.out.println("Odd:" + i);
                }
            } else {
                if (i % 2 == 0) {
                    System.out.println("Even:" + i);
                }
            }

        }

    }
}
