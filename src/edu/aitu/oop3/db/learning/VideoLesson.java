<<<<<<< HEAD:src/edu/aitu/oop3/db/learning/VideoLesson.java
package edu.aitu.oop3.db.learning;
=======
package edu.aitu.oop3.db.entity;
>>>>>>> d44e62b624f8e22040f2ebb7ad7a712ecfc7992b:src/edu/aitu/oop3/db/entity/VideoLesson.java

public class VideoLesson extends Lesson {
    private String videoUrl;

    public VideoLesson(String title, int courseId, String videoUrl) {
        super(title, courseId);
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}