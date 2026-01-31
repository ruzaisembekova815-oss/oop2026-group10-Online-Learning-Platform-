import edu.aitu.oop3.db.DatabaseConnection;
import edu.aitu.oop3.db.service.EnrollmentService;
import edu.aitu.oop3.db.service.ProgressService;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        // 1. JDBC check
        System.out.println("Connecting to Supabase...");
        try (Connection connection = DatabaseConnection.getConnection()) {
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            System.out.println("Database connection failed");
            return;
        }

        // 2. User stories demo (without real DB logic)
        EnrollmentService enrollmentService = new EnrollmentService();
        ProgressService progressService = new ProgressService();

        enrollmentService.enroll(1, 1);
        progressService.markCompleted(1, 1);
    }
}
