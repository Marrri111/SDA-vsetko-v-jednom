package org.example.javaAdvancedCoding.excercise.parallel.task2;

class Bridge {

    public synchronized void driveThrough(Car car) {

        System.out.println("I'm in bridge:" + car);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        car.setLeft(!car.isLeft());
        System.out.println("I left bridge:" + car);
    }

    //ekvivalent
    public void driveThrough2(Car car) {
        synchronized (this) {
            System.out.println("I'm in bridge:" + car);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            car.setLeft(!car.isLeft());
            System.out.println("I left bridge:" + car);
        }
    }
}
