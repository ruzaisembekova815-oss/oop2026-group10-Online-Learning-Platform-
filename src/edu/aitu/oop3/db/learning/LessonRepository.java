package edu.aitu.oop3.db.learning;

import edu.aitu.oop3.db.entity.lesson;
import edu.aitu.oop3.db.repository.Repository;

import java.util.List;

public interface LessonRepository extends Repository<lesson, Long> {
    List<lesson> findByCourseId(long courseId);
}
