package edu.aitu.oop3.db.entity;
import java.time.LocalDateTime;

public class enrollment {
    private int id;
    private int userId;
    private int courseId;
    private LocalDateTime enrolledAt;

    public enrollment(int id, int userId, int courseId, LocalDateTime enrolledAt) {
        this.id = id;
        this.userId = userId;
        this.courseId = courseId;
        this.enrolledAt = enrolledAt;
    }

    public enrollment(int userId, int courseId) {
        this.userId = userId;
        this.courseId = courseId;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getCourseId() {
        return courseId;
    }

    public LocalDateTime getEnrolledAt() {
        return enrolledAt;
    }
}


