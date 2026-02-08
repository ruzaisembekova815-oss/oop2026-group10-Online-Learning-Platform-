<<<<<<< HEAD:src/edu/aitu/oop3/db/learning/TextLesson.java
package edu.aitu.oop3.db.learning;
=======
package edu.aitu.oop3.db.entity;
>>>>>>> d44e62b624f8e22040f2ebb7ad7a712ecfc7992b:src/edu/aitu/oop3/db/entity/TextLesson.java

public class TextLesson extends Lesson {
    private String textContent;

    public TextLesson(String title, int courseId, String textContent) {
        super(title, courseId);
        this.textContent = textContent;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }
}