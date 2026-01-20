package edu.aitu.oop3.db.entity;
import java.time.LocalDateTime;

public class progress {
        private int id;
        private int userId;
        private int lessonId;
        private boolean completed;
        private LocalDateTime completedAt;

        public progress(int id, int userId, int lessonId, boolean completed, LocalDateTime completedAt) {
            this.id = id;
            this.userId = userId;
            this.lessonId = lessonId;
            this.completed = completed;
            this.completedAt = completedAt;
        }

        public progress(int userId, int lessonId) {
            this.userId = userId;
            this.lessonId = lessonId;
            this.completed = false;
        }

        public int getId() {
            return id;
        }

        public int getUserId() {
            return userId;
        }

        public int getLessonId() {
            return lessonId;
        }

        public boolean isCompleted() {
            return completed;
        }

        public LocalDateTime getCompletedAt() {
            return completedAt;
        }
    }


