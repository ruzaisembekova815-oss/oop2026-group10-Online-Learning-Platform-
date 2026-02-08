<<<<<<< HEAD:src/edu/aitu/oop3/db/learning/Lesson.java
package edu.aitu.oop3.db.learning;
=======
package edu.aitu.oop3.db.entity;
>>>>>>> d44e62b624f8e22040f2ebb7ad7a712ecfc7992b:src/edu/aitu/oop3/db/entity/Lesson.java

public abstract class Lesson {
    private int id;
    private String title;
    private int courseId;

    public Lesson(String title, int courseId) {
        this.title = title;
        this.courseId = courseId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getCourseId() { return courseId; }
    public void setCourseId(int courseId) { this.courseId = courseId; }
<<<<<<< HEAD:src/edu/aitu/oop3/db/learning/Lesson.java
}
=======
}
>>>>>>> d44e62b624f8e22040f2ebb7ad7a712ecfc7992b:src/edu/aitu/oop3/db/entity/Lesson.java
