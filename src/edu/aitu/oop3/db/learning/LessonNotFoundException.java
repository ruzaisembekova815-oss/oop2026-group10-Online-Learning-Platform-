package edu.aitu.oop3.db.learning;

public class LessonNotFoundException extends RuntimeException {

    public LessonNotFoundException() {
        super("Lesson not found.");
    }

    public LessonNotFoundException(long lessonId) {
        super("Lesson with id " + lessonId + " not found.");
    }
}

