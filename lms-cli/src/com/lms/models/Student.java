package com.lms.models;

public class Student {
    private static int count = 100;
    private String studentId;
    private String name;
    private String email;
    private String mobile;
    private String courseId; 

    public Student(String name, String email, String mobile) {
        this.studentId = "C" + count++;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.courseId = null; 
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getMobile() { return mobile; }
    public String getCourseId() { return courseId; }

    public void setCourseId(String courseId) { this.courseId = courseId; }

    @Override
    public String toString() {
        return studentId + " | " + name + " | " + email + " | " + mobile +
               " | Assigned Course: " + (courseId != null ? courseId : "None");
    }

    // Simulate notification
    public void notifyCourseAssignment() {
        if (courseId != null) {
            System.out.println("Email sent to " + email + ": You are assigned to course " + courseId);
            System.out.println("WhatsApp message sent to " + mobile + ": You are assigned to course " + courseId);
        } else {
            System.out.println("Email sent to " + email + ": Your course assignment has been removed");
            System.out.println("WhatsApp message sent to " + mobile + ": Your course assignment has been removed");
        }
    }
}
