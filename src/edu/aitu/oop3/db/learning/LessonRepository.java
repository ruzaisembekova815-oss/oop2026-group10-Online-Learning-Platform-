package edu.aitu.oop3.db.learning;  // keep your current package

import edu.aitu.oop3.db.learning.Lesson;  // correct capital L
import edu.aitu.oop3.db.repository.Repository;

import java.util.List;

public interface LessonRepository extends Repository<Lesson, Long> {
    List<Lesson> findByCourseId(long courseId);
}