package com.lms.models;

public class Instructor {
    private String instructorId;
    private String name;
    private String password;

    public Instructor(String instructorId, String name, String password) {
        this.instructorId = instructorId;
        this.name = name;
        this.password = password;
    }

    public String getInstructorId() { return instructorId; }
    public String getName() { return name; }
    public String getPassword() { return password; }

    @Override
    public String toString() {
        return instructorId + " | " + name;
    }
}
