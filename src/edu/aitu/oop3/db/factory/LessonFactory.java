package edu.aitu.oop3.db.factory;

import edu.aitu.oop3.db.entity.Lesson;
import edu.aitu.oop3.db.entity.VideoLesson;
import edu.aitu.oop3.db.entity.TextLesson;
import edu.aitu.oop3.db.entity.QuizLesson;

public class LessonFactory {
    public Lesson createLesson(String type, String title, int courseId, String content) {
        switch (type.toUpperCase()) {
            case "VIDEO":
                return new VideoLesson(title, courseId, content);
            case "TEXT":
                return new TextLesson(title, courseId, content);
            case "QUIZ":
                return new QuizLesson(title, courseId, content);
            default:
                throw new IllegalArgumentException("Unknown lesson type: " + type);
        }
    }
}