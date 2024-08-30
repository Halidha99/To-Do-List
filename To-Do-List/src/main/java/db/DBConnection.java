package db;

import model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {
    private static DBConnection instance;
    private List<User> connection;

    private DBConnection(){
        connection=new ArrayList<>();
    }
    public List<User> getConnection(){
        return connection;
    }

    public static DBConnection getInstance(){
        return null == instance ? instance = new DBConnection() : instance;
    }
}
