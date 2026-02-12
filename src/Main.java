import edu.aitu.oop3.db.DatabaseConnection;
import edu.aitu.oop3.db.learning.EnrollmentService;
import edu.aitu.oop3.db.learning.ProgressService;
import edu.aitu.oop3.db.DatabaseConnection;

import edu.aitu.oop3.db.coursemanagement.CourseBuilder;
import edu.aitu.oop3.db.learning.Lesson;
import edu.aitu.oop3.db.coursemanagement.course;
import edu.aitu.oop3.db.learning.LessonFactory;

import edu.aitu.oop3.db.coursemanagement.CourseService;  // ← ADD THIS
import edu.aitu.oop3.db.coursemanagement.CourseRepositoryImpl;  // ← if needed
import edu.aitu.oop3.db.IDB;  // if you have it

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // JDBC check
        System.out.println("Connecting to Supabase...");
        IDB db = DatabaseConnection.getInstance();  // or your way
        try (Connection connection = db.getConnection()) {
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
            return;
        }

        // Initialize services
        EnrollmentService enrollmentService = new EnrollmentService();
        ProgressService progressService = new ProgressService();
        CourseService courseService = new CourseService(new CourseRepositoryImpl(db));  // ← ADD THIS

        System.out.println("Welcome to Online Learning Platform!");

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Create a new course (Builder + Factory)");
            System.out.println("2. Enroll a student in a course");
            System.out.println("3. Mark a lesson as completed");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number.");
                continue;
            }

            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    createCourseDemo(scanner, courseService);
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    int userId = scanner.nextInt();
                    System.out.print("Enter course ID: ");
                    int courseId = scanner.nextInt();
                    enrollmentService.enroll(userId, courseId);
                    System.out.println("Student enrolled successfully!");
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    userId = scanner.nextInt();
                    System.out.print("Enter lesson ID: ");
                    int lessonId = scanner.nextInt();
                    progressService.markCompleted(userId, lessonId);
                    System.out.println("Lesson marked as completed!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }

    private static void createCourseDemo(Scanner scanner, CourseService courseService) {
        LessonFactory factory = new LessonFactory();

        System.out.print("Enter course title: ");
        String title = scanner.nextLine();

        System.out.print("Enter course description: ");
        String description = scanner.nextLine();

        System.out.print("Enter instructor ID: ");
        int instructorId = scanner.nextInt();

        course newCourse = new CourseBuilder()
                .title(title)
                .description(description)
                .instructorId(instructorId)
                .archived(false)
                .build();

        System.out.print("How many lessons to add? ");
        int lessonCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= lessonCount; i++) {
            System.out.println("\nLesson " + i + ":");
            System.out.print("Lesson type (VIDEO/TEXT/QUIZ): ");
            String type = scanner.nextLine();

            System.out.print("Lesson title: ");
            String lessonTitle = scanner.nextLine();

            System.out.print("Content (URL or text): ");
            String content = scanner.nextLine();

            Lesson lesson = factory.createLesson(type, lessonTitle, newCourse.getId(), content);
            newCourse.getLessons().add(lesson);
        }

      
        course savedCourse = courseService.addCourse(newCourse);

        System.out.println("\nCourse created and saved to Supabase!");
        System.out.println("Course ID: " + savedCourse.getId());
        System.out.println("Title: " + savedCourse.getTitle());
        System.out.println("Lessons count: " + savedCourse.getLessons().size());
        System.out.println("Tags: " + savedCourse.getTags());
    }
}
