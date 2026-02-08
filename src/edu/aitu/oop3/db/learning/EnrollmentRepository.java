package edu.aitu.oop3.db.learning;

import edu.aitu.oop3.db.repository.Repository;

import java.util.List;

public interface EnrollmentRepository extends Repository<enrollment, Integer> {
    List<enrollment> findByUserId(int userId);
    List<enrollment> findByCourseId(int courseId);
}
