package edu.aitu.oop3.db;

import edu.aitu.oop3.db.DatabaseConnection;
import edu.aitu.oop3.db.service.EnrollmentService;
import edu.aitu.oop3.db.service.ProgressService;

import edu.aitu.oop3.db.entity.CourseBuilder;
import edu.aitu.oop3.db.entity.Lesson;
import edu.aitu.oop3.db.entity.course;
import edu.aitu.oop3.db.factory.LessonFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        // 1. JDBC check (existing)
        System.out.println("Connecting to Supabase...");
        try (Connection connection = DatabaseConnection.getConnection()) {
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            System.out.println("Database connection failed");
            return;
        }

        // 2. Existing demo
        EnrollmentService enrollmentService = new EnrollmentService();
        ProgressService progressService = new ProgressService();

        enrollmentService.enroll(1, 1);
        progressService.markCompleted(1, 1);

        // 3. New Milestone 2 demo: Builder + Factory
        System.out.println("\n=== Milestone 2 Demo: Builder + Factory ===");
        LessonFactory factory = new LessonFactory();

        Lesson video = factory.createLesson("VIDEO", "OOP Intro Video", 1, "https://youtube.com/oop-intro");
        Lesson text = factory.createLesson("TEXT", "OOP Theory Text", 1, "SOLID principles explanation...");
        Lesson quiz = factory.createLesson("QUIZ", "OOP Quiz", 1, "Q1: What is encapsulation?");

        course newCourse = new CourseBuilder()
                .title("Java OOP Advanced")
                .description("Deep dive into OOP patterns")
                .instructorId(1)
                .archived(false)
                .addLesson(video)
                .addLesson(text)
                .addLesson(quiz)
                .addTag("OOP")
                .addTag("Java")
                .build();

        System.out.println("Created course: " + newCourse.getTitle());
        System.out.println("Lessons count: " + newCourse.getLessons().size());
        System.out.println("Tags: " + newCourse.getTags());
    }
}