package org.example.javaFundamentalsCoding.blok2.skipi01;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserDatabase udb = new UserDatabase();
        while (true) {
            System.out.print("1. Register \n2.Login \n3.Acces data \n4.Logout \n5. Exit \nEnter your choice: ");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    udb.registerUser(scanner);
                    break;
                case "2":
                    udb.loginUser(scanner);
                    break;
                case "3":
                    udb.accessData(scanner);
                    break;
                case "4":
                    udb.logoutUser();
                    break;
                case "5":
                    udb.exitApp();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    continue;//vráti ma to hore na switch, posledný break mi neukončí projekt
            }
        }
    }
}
