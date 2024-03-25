package org.example.jDBCandHibernate.jdbc.dao;

import cz.java11.jdbc.dao.entity.User;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.util.List;

@AllArgsConstructor
public class UserDao {
    private final String url;
    private final String user;
    private final String password;

    private Connection conn;

    void createUser() {

    }

    List<User> findUserByName(String name) {
        //prepera and execute statement
        return null;
    }

}
