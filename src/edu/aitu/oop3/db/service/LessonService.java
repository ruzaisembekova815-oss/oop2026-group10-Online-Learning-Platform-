package edu.aitu.oop3.db.service;

import edu.aitu.oop3.db.entity.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LessonService {

    private final List<lesson> lessons = new ArrayList<>();

    public void addLesson(lesson lesson) {
        lessons.add(lesson);
    }

    public List<lesson> getLessonsByCourse(long courseId) {
        return lessons.stream()
                .filter(l -> l.getCourseId() == courseId)
                .collect(Collectors.toList());
    }
}
