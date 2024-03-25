package org.example.jDBCandHibernate.jdbc;

import java.sql.*;

public class MainApp {
    public static void main(String[] args) {
        //connection -> statement -> execute

        try (final Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "Password1")) {//ziskani connection do db
            //vytvoreni prikazu pro vlozeni zaznamu. Insert... je v uvozovkach protoze jsme v jave, v casti values jsou hodnoty v ' abychom rozlisili string na DB urovni
            PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO _user(first_name,last_name) VALUES ('Jan','Novak')");
            //spustime vykonani statement, vraci pocet "zmenenych" zaznamu
            int i = insertStatement.executeUpdate();
            System.out.println(i);

            PreparedStatement selectStatement = connection.prepareStatement("SELECT * FROM _user");
            ResultSet resultSet = selectStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString(3);
                System.out.println(id + " " + firstName + " " + lastName);
            }
            // use Connection object here
        } catch (SQLException exp) {
            // exception handling
        }
    }
}
