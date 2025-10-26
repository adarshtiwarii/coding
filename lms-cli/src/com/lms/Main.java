package com.lms;

import com.lms.services.*;
import com.lms.data.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataStore.initialize();

        System.out.println("======================================");
        System.out.println("     Welcome to the LMS CLI System    ");
        System.out.println("======================================");

        while (true) {
            System.out.println("\n===== LMS MAIN MENU =====");
            System.out.println("1. Register Student");
            System.out.println("2. Instructor Login");
            System.out.println("3. List Courses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠ Invalid input! Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1:
                    StudentService.registerStudent(sc);
                    break;
                case 2:
                    InstructorService.loginInstructor(sc);
                    break;
                case 3:
                    CourseService.listCourses();
                    break;
                case 4:
                    System.out.println("👋 Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
