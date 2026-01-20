package edu.aitu.oop3.db.repository;

import edu.aitu.oop3.db.entity.enrollment;
import java.util.List;

public interface EnrollmentRepository extends Repository<enrollment, Integer> {
    List<enrollment> findByUserId(int userId);
    List<enrollment> findByCourseId(int courseId);
}
