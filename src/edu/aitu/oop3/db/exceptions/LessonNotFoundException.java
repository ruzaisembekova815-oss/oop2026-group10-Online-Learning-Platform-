package edu.aitu.oop3.db.exceptions;

public class LessonNotFoundException extends RuntimeException {

    public LessonNotFoundException() {
        super("Lesson not found.");
    }

    public LessonNotFoundException(long lessonId) {
        super("Lesson with id " + lessonId + " not found.");
    }
}

