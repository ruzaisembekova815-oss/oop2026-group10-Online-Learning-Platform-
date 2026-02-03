package edu.aitu.oop3.db.entity;

public class TextLesson extends Lesson {
    private String textContent;

    public TextLesson(String title, int courseId, String textContent) {
        super(title, courseId);
        this.textContent = textContent;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }
}