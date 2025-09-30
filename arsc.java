package coding;

import java.util.Scanner;

class arsc {
    public static void main(String[] args) {
        int d1 = 3; // number of rows
        int d2 = 3; // number of columns
        String[][] st = new String[d1][d2]; // 3x3 string array

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please enter the value 2d array");

            // input values into 2D array
            for (int i = 0; i < d1; i++) {
                for (int j = 0; j < d2; j++) {
                    st[i][j] = scan.next(); // take string input
                }
            }
        }

        // print the 2D array to check
        System.out.println("Your 2D array:");
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d2; j++) {
                System.out.print(st[i][j] + " ");
            }
            System.out.println();
        }
    }
}
