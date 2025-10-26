package com.lms.services;

import com.lms.data.DataStore;
import com.lms.models.Student;
import com.lms.utils.*;

import java.util.Scanner;

public class StudentService {
    public static void registerStudent(Scanner sc) {
        System.out.println("\n--- Student Registration ---");
        String name = ConsoleHelper.prompt(sc, "Enter Name: ");
        String email = ConsoleHelper.prompt(sc, "Enter Email: ");
        String mobile = ConsoleHelper.prompt(sc, "Enter Mobile Number: ");

        if (!InputValidator.isValidEmail(email)) {
            System.out.println("Invalid email format!");
            return;
        }
        if (!InputValidator.isValidMobile(mobile)) {
            System.out.println(" Invalid mobile number! Must be 10 digits.");
            return;
        }

        Student student = new Student(name, email, mobile);
        DataStore.students.add(student);
        System.out.println("Student Registered Successfully!");
        System.out.println("Generated ID: " + student.getStudentId());
    }
}
