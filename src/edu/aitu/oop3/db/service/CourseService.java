package edu.aitu.oop3.db.service;

import edu.aitu.oop3.db.entity.course;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CourseService {

    private final List<course> courses = new ArrayList<>();

    public void addCourse(course course) {
        courses.add(course);
    }

    public List<course> getAllCourses() {
        return courses;
    }

    public List<course> getActiveCourses() {
        return courses.stream()
                .filter(c -> !c.isArchived())
                .collect(Collectors.toList());
    }

    public List<course> getCoursesByInstructor(int instructorId) {
        return courses.stream()
                .filter(c -> c.getInstructorId() == instructorId)
                .collect(Collectors.toList());
    }
}
