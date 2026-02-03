package edu.aitu.oop3.db.service;

import edu.aitu.oop3.db.entity.Lesson;  // ← ADD THIS
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LessonService {  // ← your class name

    private final List<Lesson> lessons = new ArrayList<>();  // in-memory storage (for now)

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    public List<Lesson> getLessonsByCourse(long courseId) {
        return lessons.stream()
                .filter(l -> l.getCourseId() == courseId)  // ← l is Lesson, getCourseId() exists
                .collect(Collectors.toList());
    }

    // Add more methods if needed (e.g. getAllLessons, deleteLesson...)
}