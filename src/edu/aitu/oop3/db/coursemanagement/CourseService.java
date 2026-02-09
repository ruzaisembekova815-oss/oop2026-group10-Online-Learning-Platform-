package edu.aitu.oop3.db.coursemanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.aitu.oop3.db.coursemanagement.CourseRepository;
import edu.aitu.oop3.db.coursemanagement.course;


public class CourseService {
    private final CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }
    private final List<course> courses = new ArrayList<>();

    public course addCourse(course course) {  // ← change return type to course
        if (course.getTitle() == null || course.getTitle().trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        return repository.save(course);  // ← return the saved entity
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

