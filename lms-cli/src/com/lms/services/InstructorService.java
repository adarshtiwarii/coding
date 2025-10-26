package com.lms.services;

import com.lms.data.DataStore;
import com.lms.models.Instructor;
import com.lms.models.Student;
import com.lms.models.Course;
import com.lms.utils.ConsoleHelper;

import java.util.Scanner;

public class InstructorService {

    public static void loginInstructor(Scanner sc) {
        System.out.println("\n--- Instructor Login ---");
        String id = ConsoleHelper.prompt(sc, "Enter Instructor ID: ");
        String password = ConsoleHelper.prompt(sc, "Enter Password: ");

        for (Instructor i : DataStore.instructors) {
            if (i.getInstructorId().equalsIgnoreCase(id) && i.getPassword().equals(password)) {
                System.out.println(" Welcome, " + i.getName() + "!");
                instructorMenu(sc);
                return;
            }
        }
        System.out.println("Invalid credentials!");
    }

    private static void instructorMenu(Scanner sc) {
        while (true) {
            System.out.println("\n--- Instructor Menu ---");
            System.out.println("1. View Registered Students");
            System.out.println("2. Assign Student to Course");
            System.out.println("3. Update Student Course");
            System.out.println("4. Remove Student Course Assignment");
            System.out.println("5. View Courses");
            System.out.println("6. Logout");

            int choice;
            try {
                choice = Integer.parseInt(ConsoleHelper.prompt(sc, "Enter choice: "));
            } catch (NumberFormatException e) {
                System.out.println("⚠ Invalid input!");
                continue;
            }

            switch (choice) {
                case 1: viewStudents(); break;
                case 2: assignStudentToCourse(sc); break;
                case 3: updateStudentCourse(sc); break;
                case 4: removeStudentCourse(sc); break;
                case 5: CourseService.listCourses(); break;
                case 6: return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    private static void viewStudents() {
        System.out.println("\n--- Registered Students ---");
        if (DataStore.students.isEmpty()) {
            System.out.println("No students registered yet.");
        } else {
            for (Student s : DataStore.students) {
                System.out.println(s);
            }
        }
    }

    private static Student findStudentById(String studentId) {
        for (Student s : DataStore.students) {
            if (s.getStudentId().equalsIgnoreCase(studentId)) {
                return s;
            }
        }
        return null;
    }

    private static Course findCourseById(String courseId) {
        for (Course c : DataStore.courses) {
            if (c.getCourseId().equalsIgnoreCase(courseId)) {
                return c;
            }
        }
        return null;
    }

    private static void assignStudentToCourse(Scanner sc) {
        String studentId = ConsoleHelper.prompt(sc, "\nEnter Student ID to assign: ");
        Student student = findStudentById(studentId);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.println("\nAvailable Courses:");
        for (Course c : DataStore.courses) System.out.println(c);

        String courseId = ConsoleHelper.prompt(sc, "Enter Course ID to assign: ");
        Course course = findCourseById(courseId);
        if (course == null) {
            System.out.println("Invalid Course ID!");
            return;
        }

        student.setCourseId(courseId);
        System.out.println("Student assigned to course " + courseId);
        student.notifyCourseAssignment();
    }

    private static void updateStudentCourse(Scanner sc) {
        String studentId = ConsoleHelper.prompt(sc, "\nEnter Student ID to update: ");
        Student student = findStudentById(studentId);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.println("\nAvailable Courses:");
        for (Course c : DataStore.courses) System.out.println(c);

        String courseId = ConsoleHelper.prompt(sc, "Enter new Course ID: ");
        Course course = findCourseById(courseId);
        if (course == null) {
            System.out.println("Invalid Course ID!");
            return;
        }

        student.setCourseId(courseId);
        System.out.println("Student course updated to " + courseId);
        student.notifyCourseAssignment();
    }

    private static void removeStudentCourse(Scanner sc) {
        String studentId = ConsoleHelper.prompt(sc, "\nEnter Student ID to remove course: ");
        Student student = findStudentById(studentId);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        student.setCourseId(null);
        System.out.println("Student course assignment removed.");
        student.notifyCourseAssignment();
    }
}
