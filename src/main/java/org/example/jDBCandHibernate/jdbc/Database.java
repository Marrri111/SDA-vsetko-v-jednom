package org.example.jDBCandHibernate.jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;
import lombok.RequiredArgsConstructor;
import org.flywaydb.core.Flyway;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class Database {
    private final String url;
    private final String user;
    private final String password;

    private Connection conn;

    public void migrate() {
        Flyway flyway = Flyway.configure().dataSource(url, user, password).load();
        flyway.migrate();
    }

    public void connect() throws SQLException {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setURL(url);
        mysqlDataSource.setUser(user);
        mysqlDataSource.setPassword(password);
        conn = mysqlDataSource.getConnection();
    }

    public void disconnect() throws SQLException {
        conn.close();
    }

    /**
     * PreparedStatement.executeUpdate - ocekava sql update nebo insert, vraci pocet "dotcenych" radku
     * PreparedStatement.executeQuery - ocekava sql select a vraci ResultSet (tabulku)
     * <p>
     * oba dva muzou mit .setString .setInt pro nahrazeni "?" v dotazu
     */

    public List<User> getAllUsers() throws SQLException {
        ArrayList<User> users = new ArrayList<>();
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM _user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String lastName = resultSet.getString(3);
            users.add(new User(id, name, lastName));
        }
        return users;
    }

    public int createUser(String name, String lastName) throws SQLException {
//        String sql = "insert into _user(first_name, last_name) values ('" + name + "', '" + lastName + "')";
//        PreparedStatement preparedStatement = conn.prepareStatement(sql);

//        String sql = "insert into _user(first_name, last_name) values (?,?)";
//        PreparedStatement preparedStatement = conn.prepareStatement(sql);
//
//        preparedStatement.setString(1, name);
//        preparedStatement.setString(2, lastName);
//        return preparedStatement.executeUpdate();
        return runMyQuery("insert into _user(first_name, last_name) values (?,?)", name, lastName);
    }

    public int createExame(int id, String subject, int value) throws SQLException {
//        String sql = "insert into _user(first_name, last_name) values ('" + name + "', '" + lastName + "')";
//        PreparedStatement preparedStatement = conn.prepareStatement(sql);

//        String sql = "insert into exam(person_id, _subject, _value) values (?,?,?)";
//        PreparedStatement preparedStatement = conn.prepareStatement(sql);
//
//        preparedStatement.setInt(1, id);
//        preparedStatement.setString(2, subject);
//        preparedStatement.setInt(3, value);
//        return preparedStatement.executeUpdate();
        return runMyQuery("insert into exam(person_id, _subject, _value) values (?,?,?)", id, subject, value);
    }

    public void printExams(int id) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT u.first_name, e._subject, e._value FROM school._user u, school.exam e WHERE u.id = e.person_id AND u.id =?;");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));
        }
    }

    public int deleteUser(int id) throws SQLException {
        deleteExamByUser(id);
//        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM _User WHERE id = ?");
//        preparedStatement.setInt(1, id);
//        return preparedStatement.executeUpdate();
        return runMyQuery("DELETE FROM _User WHERE id = ?", id);

    }

    public int deleteUsers() throws SQLException {
//        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM _User WHERE 1=1");
//        return preparedStatement.executeUpdate();
        return runMyQuery("DELETE FROM _User WHERE 1=1");
    }

    public void deleteExamByUser(int userId) throws SQLException {
//        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM EXAM WHERE person_id=?");
//        preparedStatement.setInt(1,userId);
//        preparedStatement.executeUpdate();
        runMyQuery("DELETE FROM EXAM WHERE person_id=?", userId);
    }

    private int runMyQuery(String sql, Object... params) throws SQLException {
        //String sql = "insert into exam(person_id, _subject, _value) values (?,?,?)";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        for (int i = 0; i < params.length; i++) {
            if (params[i] instanceof String) {
                preparedStatement.setString(i + 1, params[i].toString());
            }
            if (params[i] instanceof Integer) {
                preparedStatement.setInt(i + 1, Integer.valueOf(params[i].toString()));
            }
        }
        return preparedStatement.executeUpdate();
    }
}
