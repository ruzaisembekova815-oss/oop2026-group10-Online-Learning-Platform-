package edu.aitu.oop3.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class    DatabaseConnection {
    private static final String URL =
            "jdbc:postgresql://aws-1-ap-southeast-1.pooler.supabase.com:6543/postgres?sslmode=require";
    private static final String USER = "postgres.mijqjvlwhigsxejmxqba";
    private static final String PASSWORD = "JbpPKXMY0sXNYCGv" ;// ← DATABASE PASSWORD
    private DatabaseConnection() {
        // no instances
    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static class Page<T> {

        private final List<T> content;
        private final int page;
        private final int size;
        private final long totalelements;

        public Page(List<T> content, int page, int size, long totalelements) {
            this.content = content;
            this.page = page;
            this.size = size;
            this.totalelements = totalelements;
        }

        public List<T> getContent() {
            return content;
        }

        public int getPage() {
            return page;
        }

        public int getSize() {
            return size;
        }

        public long getTotalelements() {
            return totalelements;
        }

        public int getTotalPages() {
            return (int) Math.ceil((double) totalelements / size);
        }
    }
}
