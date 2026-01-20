package edu.aitu.oop3.db.exceptions;

public class CourseArchiveException extends RuntimeException {

    public CourseArchiveException() {
        super("Course is archived and cannot be modified.");
    }

    public CourseArchiveException(String message) {
        super(message);
    }
}


