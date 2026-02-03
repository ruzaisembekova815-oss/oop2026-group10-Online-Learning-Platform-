package edu.aitu.oop3.db.entity;

public abstract class Lesson {
    private int id;
    private String title;
    private int courseId;

    public Lesson(String title, int courseId) {
        this.title = title;
        this.courseId = courseId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getCourseId() { return courseId; }
    public void setCourseId(int courseId) { this.courseId = courseId; }
}
