package com.lms.services;

import com.lms.data.DataStore;
import com.lms.models.Course;

public class CourseService {
    public static void listCourses() {
        System.out.println("\n--- Available Courses ---");
        for (Course c : DataStore.courses) {
            System.out.println(c);
        }
    }
}
