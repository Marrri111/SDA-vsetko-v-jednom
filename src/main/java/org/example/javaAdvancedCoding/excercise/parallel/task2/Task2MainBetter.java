package org.example.javaAdvancedCoding.excercise.parallel.task2;

import java.util.List;
import java.util.stream.Collectors;

public class Task2MainBetter {
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

        List<Thread> threads = cars.stream().map(car -> {
            Thread thread = new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    bridge.driveThrough(cars.get(0));

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {

                    }

                }
            });
            return thread;
        }).collect(Collectors.toList());
        threads.forEach(t -> t.start());
        threads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {

            }
        });

    }

}
