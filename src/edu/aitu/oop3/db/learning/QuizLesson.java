package edu.aitu.oop3.db.learning;

public class QuizLesson extends Lesson {
    private String questions;

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