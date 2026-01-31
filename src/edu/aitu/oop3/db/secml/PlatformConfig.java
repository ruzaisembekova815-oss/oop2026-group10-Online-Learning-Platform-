package edu.aitu.oop3.db.secml;

public class PlatformConfig {

    private static PlatformConfig instance;

    private final String platformName;
    private final int maxCoursePerInstructor;

    private PlatformConfig() {
            this.platformName = "Online Learning Platform";
            this.maxCoursePerInstructor = 20;
    }

    public static synchronized PlatformConfig getInstance() {
        if (instance == null) {
            instance = new PlatformConfig();
        }
        return instance;
    }

    public String getPlatformName() {
        return platformName;
    }

    public int getMaxCoursePerInstructor() {
        return maxCoursePerInstructor;
    }
}


