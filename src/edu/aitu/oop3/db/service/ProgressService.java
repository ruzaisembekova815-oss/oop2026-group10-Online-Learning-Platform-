package edu.aitu.oop3.db.service;

public class ProgressService {

    public void markCompleted(int userId, int lessonId) {
        System.out.println("User " + userId + " completed lesson " + lessonId);
    }
}
