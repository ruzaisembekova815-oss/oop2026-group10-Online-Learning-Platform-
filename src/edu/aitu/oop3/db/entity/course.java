package edu.aitu.oop3.db.entity;

public class course {
    private int id;
    private String title;
    private String description;
    private int instructorId;
    private boolean archived;

    
    public course() {
    }

    
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

    public String getDescription() {
        return description;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public boolean isArchived() {
        return archived;
    }

    
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
