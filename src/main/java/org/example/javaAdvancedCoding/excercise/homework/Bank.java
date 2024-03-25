package org.example.javaAdvancedCoding.excercise.homework;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void addAccount(String name, int amount) {
        //todo implement
    }

    public void transfer(BankAccount from, BankAccount to, int amount) {
        //todo implement
    }

    public int getDepositForName(String name) {
        //todo implement
        return 0;
    }

    public BankAccount find(String name) {
        //todo
        return null;
    }

}
