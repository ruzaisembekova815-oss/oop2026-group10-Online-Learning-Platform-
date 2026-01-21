package edu.aitu.oop3.db.repository;

import edu.aitu.oop3.db.entity.course;
import java.util.List;

public interface CourseRepository extends Repository<course, Integer> {
    List<course> findByInstructorId(int instructorId);
}
