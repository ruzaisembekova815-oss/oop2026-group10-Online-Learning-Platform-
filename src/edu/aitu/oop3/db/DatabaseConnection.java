package edu.aitu.oop3.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection implements IDB {
    private static final String URL =
            "jdbc:postgresql://aws-1-ap-southeast-1.pooler.supabase.com:5432/postgres?sslmode=require";
    private static final String USER = "postgres.mijqjvlwhigsxejmxqba";
    private static final String PASSWORD = "JbpPKXMY0sXNYCGv" ;// ← DATABASE PASSWORD
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
