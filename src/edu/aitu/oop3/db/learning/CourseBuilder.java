package edu.aitu.oop3.db.entity;

import java.util.ArrayList;
import java.util.List;

public class CourseBuilder {
    private String title;
    private String description;
    private int instructorId;
    private boolean archived = false;
    private List<Lesson> lessons = new ArrayList<>();
    private List<String> tags = new ArrayList<>();

    public CourseBuilder title(String title) {
        this.title = title;
        return this;
    }

    public CourseBuilder description(String description) {
        this.description = description;
        return this;
    }

    public CourseBuilder instructorId(int instructorId) {
        this.instructorId = instructorId;
        return this;
    }

    public CourseBuilder archived(boolean archived) {
        this.archived = archived;
        return this;
    }

    public CourseBuilder addLesson(Lesson lesson) {
        this.lessons.add(lesson);
        return this;
    }

    public CourseBuilder addTag(String tag) {
        this.tags.add(tag);
        return this;
    }

    public course build() {
        course c = new course();
        c.setTitle(title);
        c.setDescription(description);
        c.setInstructorId(instructorId);
        c.setArchived(archived);
        c.setLessons(lessons);
        c.setTags(tags);
        return c;
    }
}