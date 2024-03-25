package org.example.javaAdvancedCoding.parallel;

public class CoordinationThreads {
    public static void main(String[] args) throws InterruptedException {
        final Customer customer = new Customer();
        final Thread withDrawThread = new Thread(() -> customer.withdraw(1000));
        final Thread depositThreadA = new Thread(() -> customer.deposit(500));
        final Thread depositThreadB = new Thread(() -> customer.deposit(500));

        withDrawThread.start();
        depositThreadA.start();
        depositThreadB.start();
    }
}

class Customer {
    private int availableAmount = 0;

    synchronized void withdraw(int amountToWithdraw) {
        System.out.println("Trying to withdraw " + amountToWithdraw + " PLN");
        while (availableAmount < amountToWithdraw) {
            System.out.println("Not enough money! Waiting for transfer!");
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Oops");
            }
        }
        System.out.println("Withdraw successful!");
    }

    synchronized void deposit(final int amountToDeposit) {
        System.out.println("Depositing " + amountToDeposit + " PLN");
        availableAmount += amountToDeposit;
        notify();
    }
}
