package org.example.javaFundamentals.november.dvanasty.bank;

public class Account {
    private int number;
    private int deposit;

    private static int lastNumber = 1;
    public Account() {
        this.number = ++lastNumber;
    }


    public void addMoney(int amount){
        deposit += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", deposit=" + deposit +
                '}';
    }
}
