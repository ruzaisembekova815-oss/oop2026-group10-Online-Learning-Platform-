package edu.aitu.oop3.db.entity;

public class course {
    private int id;
    private String title;
    private String description;
    private int instructorId;
    private boolean archived;

    // No-arg constructor (important for creating empty objects)
    public course() {
    }

    // Full constructor (optional, but useful)
    public course(int id, String title, String description, int instructorId, boolean archived) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.instructorId = instructorId;
        this.archived = archived;
    }

    // Getters (you already have most)
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public boolean isArchived() {
        return archived;
    }

    // Add setters (critical!)
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    // Optional: toString() for easy printing in Main/demo
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", instructorId=" + instructorId +
                ", archived=" + archived +
                '}';
    }
}