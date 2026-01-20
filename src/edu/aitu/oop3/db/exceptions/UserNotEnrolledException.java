package edu.aitu.oop3.db.exceptions;

public class UserNotEnrolledException extends RuntimeException {

    public UserNotEnrolledException() {
        super("User is not enrolled in this course.");
    }

    public UserNotEnrolledException(int userId, int courseId) {
        super("User with id " + userId + " is not enrolled in course " + courseId + ".");
    }
}


