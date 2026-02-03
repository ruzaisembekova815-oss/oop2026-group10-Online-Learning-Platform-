package edu.aitu.oop3.db.entity;

import java.util.ArrayList;
import java.util.List;

public class course {
    private int id;
    private String title;
    private String description;
    private int instructorId;
    private boolean archived;
    private List<Lesson> lessons = new ArrayList<>();
    private List<String> tags = new ArrayList<>();

    // Constructors (add if missing)
    public course() {
    }

    // Existing getters from Milestone 1 (add if missing)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Lesson> getLessons() {
        return lessons;
    }

    public List<String> getTags() {
        return tags;
    }

    // MISSING SETTERS — ADD THESE!
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

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}