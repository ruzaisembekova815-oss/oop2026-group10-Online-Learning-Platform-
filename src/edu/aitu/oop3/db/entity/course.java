package edu.aitu.oop3.db.entity;

public class course {

    private int id;
    private String title;
    private String description;
    private int instructorId;
    private boolean archived;

    public course(int id, String title, String description, int instructorId, boolean archived) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.instructorId = instructorId;
        this.archived = archived;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isArchived() {
        return archived;
    }

    public int getInstructorId() {
        return instructorId;
    }
}
