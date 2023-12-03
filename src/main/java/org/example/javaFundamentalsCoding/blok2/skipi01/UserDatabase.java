package org.example.javaFundamentalsCoding.blok2.skipi01;

import java.util.Scanner;

public class UserDatabase {

    private User[] users;
    private int userCount;
    private User loggedInUser;

    public UserDatabase() {
        users = new User[3];
        userCount = 0;
    }

    //part 2
    public void registerUser(Scanner scanner) {
        if (userCount < users.length) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            if (isUsernameTaken(username)) {
                System.out.println("Username is already taken. Please choose a different one.");
                return; //(ten return tam nemusím písať) vráti ma to do interface, aby mu znova ponúklo možnosť vybrať si, čochce robiť
            } else {

                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                System.out.print("Enter data: ");
                String data = scanner.nextLine();

                User newUser = new User(username, password, data);
                users[userCount] = newUser;
                userCount++;

                System.out.println("Registration successful!");
            }
        } else {
            System.out.println("Maximum number of users reached. Cannot register more users.");
        }
    }

    private boolean isUsernameTaken(String username) {
        for (User user : users) {
            if (user != null && username.equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }

    //part3
    public void loginUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        for (User user : users) {
            if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
                loggedInUser = user;
                System.out.println("Login successful!");
                return;
            }
        }
        System.out.println("Invalid username or password. Please try again.");
    }

    //part4
    public void accessData(Scanner scanner) {
        if (loggedInUser != null) {
            System.out.println("User data: " + loggedInUser.getData());
        } else {
            System.out.println("You are not logged in.");
        }
    }

    //part5
    public void logoutUser() {
        if (loggedInUser != null) {
            System.out.println("Log out: " + loggedInUser.getUsername());
            loggedInUser = null;
        } else {
            System.out.println("You are not logged in.");
        }
    }
    public void exitApp(){
        System.out.println("Thank you for using our app :D");
        System.exit(5);
    }
}
