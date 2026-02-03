package edu.aitu.oop3.db.repository;

import edu.aitu.oop3.db.entity.Lesson;
import java.util.List;

public interface LessonRepository extends Repository<Lesson, Long> {
    List<Lesson> findByCourseId(long courseId);
}
