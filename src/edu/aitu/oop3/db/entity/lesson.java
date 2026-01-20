package edu.aitu.oop3.db.entity;

public class lesson {
    private long id;
    private long courseId;
    private String title;

    public lesson(long id, long courseId, String title) {
        this.id = id;
        this.courseId = courseId;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public long getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }
}


