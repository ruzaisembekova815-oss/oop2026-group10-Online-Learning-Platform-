package edu.aitu.oop3.db;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection implements IDB {

    private static final Properties props = new Properties();

    static {
        try (InputStream input = DatabaseConnection.class.getClassLoader()
                .getResourceAsStream("config.properties")) {
            if (input == null) {
                throw new RuntimeException("config.properties not found in resources");
            }
            props.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }

    private static final String URL = props.getProperty("supabase.url");
    private static final String USER = props.getProperty("supabase.user");
    private static final String PASSWORD = props.getProperty("supabase.password");

    private DatabaseConnection() {
    }

    public static IDB getInstance() {
        return new DatabaseConnection();
    }

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
