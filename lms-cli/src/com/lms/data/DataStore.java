package com.lms.data;

import com.lms.models.*;
import java.util.*;

public class DataStore {
    public static List<Student> students = new ArrayList<>();
    public static List<Instructor> instructors = new ArrayList<>();
    public static List<Course> courses = new ArrayList<>();

    public static void initialize() {
        instructors.add(new Instructor("I101", "Adarsh Tiwari", "123456"));
        instructors.add(new Instructor("I102", "Prof. Johnson", "admin"));
        courses.add(new Course("CS101", "Java Programming"));
        courses.add(new Course("CS102", "Web Development"));
    }
}
