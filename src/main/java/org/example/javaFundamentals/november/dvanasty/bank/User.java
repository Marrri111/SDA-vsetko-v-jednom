package org.example.javaFundamentals.november.dvanasty.bank;

public class User {
    private String name;

    private Account account;

    public User(String name) {
        this.name = name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
