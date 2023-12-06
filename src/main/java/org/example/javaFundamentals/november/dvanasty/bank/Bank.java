package org.example.javaFundamentals.november.dvanasty.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Account> acounts = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void createAccount(User u){
        Account account = new Account();
        u.setAccount(account);
        acounts.add(account);

    }

    public User createUser(String name){
        User user = new User(name);
        users.add(user);
        return user;
    }

    public void insertMoney(User u, int n){
        u.getAccount().addMoney(n);
    }

    public void transferMoney(User from, User to, int amount){
        from.getAccount().addMoney(-amount);
        to.getAccount().addMoney(amount);
    }

    public static void main(String[] args) {
        Bank moneta = new Bank("Moneta");
        String u1 = "pepa";
        //user neexistuje vytvorime
        User pepa = moneta.createUser(u1);
        moneta.createAccount(pepa);

        User jana = moneta.createUser("jana");
        moneta.createAccount(jana);

        moneta.insertMoney(pepa, 1000);
        moneta.insertMoney(jana, 5000);

        //todo osetrete ze yustatky nepujdou do minusu, v takovem pripade neprevadejte penize a do soutu vypiste chybu
        moneta.transferMoney(pepa, jana, 500);
        System.out.println(pepa);
        System.out.println(jana);
    }

}
