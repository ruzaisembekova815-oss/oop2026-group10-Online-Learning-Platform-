package edu.aitu.oop3.db.extension;

import edu.aitu.oop3.db.entity.course;
import edu.aitu.oop3.db.entity.lesson;
import edu.aitu.oop3.db.entity.user;
import edu.aitu.oop3.db.service.CourseService;
import edu.aitu.oop3.db.service.LessonService;
import edu.aitu.oop3.db.service.UserService;

public class AppDemo {

    public static void main(String[] args) {

        UserService userService = new UserService();
        CourseService courseService = new CourseService();
        LessonService lessonService = new LessonService();

        System.out.println("=== USERS ===");
        for (user u : userService.getAllUsers()) {
            System.out.println(u.getId() + " | " + u.getName() + " | " + u.getRole());
        }

        course java = new course(1, "Java OOP", "Learn OOP in Java", 1, false);
        courseService.addCourse(java);

        lessonService.addLesson(new lesson(1, 1, "Classes & Objects"));
        lessonService.addLesson(new lesson(2, 1, "Inheritance"));

        System.out.println("\n=== COURSES ===");
        courseService.getActiveCourses()
                .forEach(c -> System.out.println(c.getTitle()));

        System.out.println("\n=== LESSONS FOR COURSE 1 ===");
        lessonService.getLessonsByCourse(1)
                .forEach(l -> System.out.println(l.getTitle()));
    }
}
