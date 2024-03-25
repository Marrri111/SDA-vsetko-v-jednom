package org.example.jDBCandHibernate.jdbc;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class SchoolMain {
    static Scanner scanner = new Scanner(System.in);
    static Database db;

    public static void main(String[] args) {
        boolean exit = false;
        String user = "root";
        String password = "Password1";
        if (args.length == 2) {
            user = args[0];
            password = args[1];
        }
        db = new Database("jdbc:mysql://localhost:3306/school", user, password);
        db.migrate();
        try {
            db.connect();
            do {
                String[] command = getCommand();
                String firstCmd = command[0].toUpperCase();
                switch (firstCmd) {
                    case "EXIT" -> exit = true;
                    case "LIST" -> show();
                    case "INSERT" -> insert(command);
                    case "DELETE" -> delete(command);
                    case "EXAM" -> exam(command);
                    case "SHOW_EXAM" -> showExam(command);
                }
            } while (!exit);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void showExam(String[] command) throws SQLException {
        // show_exam userId
        // userName subject value
        db.printExams(Integer.parseInt(command[1]));
    }

    private static void exam(String[] command) throws SQLException {
        //exam idUser subject value
        int exame = db.createExame(Integer.parseInt(command[1]), command[2], Integer.parseInt(command[3]));

        if (exame == 1) {
            System.out.println("Exam was created");
        }

        //exam 1 math 2

    }

    private static void delete(String[] command) throws SQLException {
        //delete idUser i.e delete 1
        //delete all
        int id = -1;
        try {
            id = Integer.parseInt(command[1]);
        } catch (NumberFormatException e) {

        }
        int deletedCount = id == -1 ? db.deleteUsers() : db.deleteUser(id);
        if (deletedCount > 0) {
            System.out.println(deletedCount + " Users deleted");
        }
    }

    private static void insert(String[] command) throws SQLException {
        db.createUser(command[1], command[2]);
    }

    private static void show() throws SQLException {
        System.out.println("Content of users");
        List<User> allUsers = db.getAllUsers();
        allUsers.forEach(System.out::println);
    }

    static String[] getCommand() {
        // exit
        // list
        // insert name lastName
        return scanner.nextLine().split(" ");

    }
}
