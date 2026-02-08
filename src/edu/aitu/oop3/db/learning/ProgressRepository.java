package edu.aitu.oop3.db.learning;

import edu.aitu.oop3.db.repository.Repository;

import java.util.List;

public interface ProgressRepository extends Repository<progress, Integer> {
    List<progress> findByUserId(int userId);
    List<progress> findByLessonId(int lessonId);
}
