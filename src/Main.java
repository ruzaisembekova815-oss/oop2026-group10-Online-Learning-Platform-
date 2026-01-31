import edu.aitu.oop3.db.DatabaseConnection;
import edu.aitu.oop3.db.IDB;
import edu.aitu.oop3.db.repository.CourseRepository;
import edu.aitu.oop3.db.repository.CourseRepositoryImpl;
import edu.aitu.oop3.db.service.CourseService;
import edu.aitu.oop3.db.service.EnrollmentService;
import edu.aitu.oop3.db.service.ProgressService;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {





        System.out.println("Connecting to Supabase...");
        try {
            IDB db = DatabaseConnection.getInstance();
            Connection conn = db.getConnection();
            System.out.println("Connected via IDB!");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        EnrollmentService enrollmentService = new EnrollmentService();
        ProgressService progressService = new ProgressService();

        enrollmentService.enroll(1, 1);
        progressService.markCompleted(1, 1);

    }
}