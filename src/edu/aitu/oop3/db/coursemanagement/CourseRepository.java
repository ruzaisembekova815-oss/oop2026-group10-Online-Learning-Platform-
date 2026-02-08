package edu.aitu.oop3.db.coursemanagement;

import edu.aitu.oop3.db.repository.Repository;

import java.util.List;

public interface CourseRepository extends Repository<course, Integer> {
    List<course> findByInstructorId(int instructorId);
}
