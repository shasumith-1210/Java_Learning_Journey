/*
 * STUDENT MARKS ANALYZER
 * This program stores the marks of multiple students using an array and performs various analyses such as:
 *
 * Displaying all marks
 * Calculating total and average marks
 * Finding the highest and lowest marks
 * Counting passed and failed students
 * Identifying the class topper
 *
 */

import java.util.Scanner;
public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students : ");
        int numberOfStudents = sc.nextInt();

        int[] marks = new int[numberOfStudents];

        System.out.println();

        // Taking marks as input.
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks of Student " + (i + 1) + " : ");
            marks[i] = sc.nextInt();
        }

        System.out.println("\n========== STUDENT REPORT ==========\n");

        // Display all marks.
        System.out.println("Marks Obtained :");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + " : " + marks[i]);
        }

        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];
        int topper = 0;
        int passed = 0;
        int failed = 0;

        // Analyze marks.
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
            if (marks[i] > highest) {
                highest = marks[i];
                topper = i;
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            if (marks[i] >= 40) {
                passed++;
            } else {
                failed++;
            }

        }

        double average = (double) total / numberOfStudents;

        System.out.println("\nTotal Marks : " + total);
        System.out.printf("Average Marks : %.2f%n", average);

        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks : " + lowest);

        System.out.println("Students Passed : " + passed);
        System.out.println("Students Failed : " + failed);

        System.out.println("Class Topper : Student " + (topper + 1));

        sc.close();
    }
}