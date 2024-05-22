package de.lubowiecki.playground.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {

    private static final String URL = "jdbc:sqlite:data.db";

    private DbUtils() {
    }

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(URL);
    }
}
