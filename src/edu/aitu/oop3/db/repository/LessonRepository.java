package edu.aitu.oop3.db.repository;

import edu.aitu.oop3.db.entity.lesson;
import java.util.List;

public interface LessonRepository extends Repository<lesson, Long> {
    List<lesson> findByCourseId(long courseId);
}
