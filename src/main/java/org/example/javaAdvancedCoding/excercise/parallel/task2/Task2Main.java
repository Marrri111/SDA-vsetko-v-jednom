package org.example.javaAdvancedCoding.excercise.parallel.task2;

import java.util.List;

public class Task2Main {
    //Write a program that will solve the problem below.
    //On the road between the towns A and B there is a bridge on which there can be
    //only one car. Implement a mechanism that will allow synchronized access by a
    //car objects to object of the Bridge class.
    //The Car class should contain the following data:
    //car name
    //car type
    //The Bridge class can contain the following method:
    //driveThrough, which will accept as parameter the object of the Car class.
    //The journey should take 5s.

    public static void main(String[] args) throws InterruptedException {
        List<Car> cars = List.of(new Car("toyota", "hybrid", true), new Car("BMW", "diesel", false), new Car("audi", "gas", true));


        Bridge bridge = new Bridge();


        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                bridge.driveThrough(cars.get(0));

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }

            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                bridge.driveThrough(cars.get(1));
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                bridge.driveThrough(cars.get(2));
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }
            }
        });

        thread.start();
        thread2.start();
        thread3.start();

        thread.join();
        thread2.join();
        thread3.join();
    }

}

