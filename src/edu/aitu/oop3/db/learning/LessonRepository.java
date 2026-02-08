package edu.aitu.oop3.db.learning;

<<<<<<< HEAD:src/edu/aitu/oop3/db/learning/LessonRepository.java
import edu.aitu.oop3.db.entity.lesson;
import edu.aitu.oop3.db.repository.Repository;

=======
import edu.aitu.oop3.db.entity.Lesson;
>>>>>>> d44e62b624f8e22040f2ebb7ad7a712ecfc7992b:src/edu/aitu/oop3/db/repository/LessonRepository.java
import java.util.List;

public interface LessonRepository extends Repository<Lesson, Long> {
    List<Lesson> findByCourseId(long courseId);
}
