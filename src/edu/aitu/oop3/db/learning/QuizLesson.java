<<<<<<< HEAD:src/edu/aitu/oop3/db/learning/QuizLesson.java
package edu.aitu.oop3.db.learning;

public class QuizLesson extends Lesson {
    private String questions;
=======
package edu.aitu.oop3.db.entity;

public class QuizLesson extends Lesson {
    private String questions; 
>>>>>>> d44e62b624f8e22040f2ebb7ad7a712ecfc7992b:src/edu/aitu/oop3/db/entity/QuizLesson.java

    public QuizLesson(String title, int courseId, String questions) {
        super(title, courseId);
        this.questions = questions;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }
<<<<<<< HEAD:src/edu/aitu/oop3/db/learning/QuizLesson.java
}
=======
}
>>>>>>> d44e62b624f8e22040f2ebb7ad7a712ecfc7992b:src/edu/aitu/oop3/db/entity/QuizLesson.java
