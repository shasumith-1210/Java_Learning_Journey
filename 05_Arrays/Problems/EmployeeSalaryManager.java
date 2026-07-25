/*
 * EMPLOYEE SALARY MANAGER
 *
 * This program stores the salaries of employees using an array
 * and performs various analyses such as:
 *
 * Displaying all employee salaries
 * Calculating the total salary expenditure
 * Calculating the average salary
 * Finding the highest and lowest salary
 * Counting employees earning above the average salary
 *
 */

import java.util.Scanner;
public class EmployeeSalaryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees : ");
        int numberOfEmployees = sc.nextInt();

        double[] salaries = new double[numberOfEmployees];

        // Taking salary details as input.
        for (int i = 0; i < salaries.length; i++) {
            System.out.print("Enter salary of Employee " + (i + 1) + " : ");
            salaries[i] = sc.nextDouble();
        }

        double totalSalary = 0;
        double highestSalary = salaries[0];
        double lowestSalary = salaries[0];
        int highestPaidEmployee = 0;
        int lowestPaidEmployee = 0;

        // Analyzing salaries.
        for (int i = 0; i < salaries.length; i++) {
            totalSalary += salaries[i];

            if (salaries[i] > highestSalary) {
                highestSalary = salaries[i];
                highestPaidEmployee = i;
            }

            if (salaries[i] < lowestSalary) {
                lowestSalary = salaries[i];
                lowestPaidEmployee = i;
            }
        }

        double averageSalary = totalSalary / numberOfEmployees;
        int aboveAverageEmployees = 0;

        // Counting employees earning above average salary.
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > averageSalary) {
                aboveAverageEmployees++;
            }
        }

        // Displaying salary report.
        System.out.println("\n========== EMPLOYEE SALARY REPORT ==========\n");

        for (int i = 0; i < salaries.length; i++) {
            System.out.printf("Employee %d : $%.2f%n", (i + 1), salaries[i]);
        }

        System.out.printf("%nTotal Salary Expenditure : $%.2f%n", totalSalary);
        System.out.printf("Average Salary : $%.2f%n", averageSalary);

        System.out.printf("Highest Salary : $%.2f (Employee %d)%n", highestSalary, highestPaidEmployee + 1);

        System.out.printf("Lowest Salary : $%.2f (Employee %d)%n",  lowestSalary, lowestPaidEmployee + 1);

        System.out.println("Employees Above Average Salary : " + aboveAverageEmployees);

        sc.close();

    }
}