package org.example.javaFundamentalsCoding.blok2.skipi01;

public class User {
    private String username;
    private String password;
    private String data;

    public User(String username, String password, String data) {
        this.username = username;
        this.password = password;
        this.data = data;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getData() {
        return data;
    }

}

