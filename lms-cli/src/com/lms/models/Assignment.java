package com.lms.models;

public class Assignment {
    private String assignmentId;
    private String title;
    private String courseId;

    public Assignment(String assignmentId, String title, String courseId) {
        this.assignmentId = assignmentId;
        this.title = title;
        this.courseId = courseId;
    }

    public String getAssignmentId() { return assignmentId; }
    public String getTitle() { return title; }
    public String getCourseId() { return courseId; }

    @Override
    public String toString() {
        return assignmentId + " - " + title + " (Course: " + courseId + ")";
    }
}
