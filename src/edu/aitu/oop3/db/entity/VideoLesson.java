package edu.aitu.oop3.db.entity;

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