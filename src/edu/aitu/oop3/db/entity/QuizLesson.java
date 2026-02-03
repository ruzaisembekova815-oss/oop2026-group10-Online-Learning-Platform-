package edu.aitu.oop3.db.entity;

public class QuizLesson extends Lesson {
    private String questions;  // Simple string for questions (or List<String> if needed)

    public QuizLesson(String title, int courseId, String questions) {
        super(title, courseId);
        this.questions = questions;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }
}