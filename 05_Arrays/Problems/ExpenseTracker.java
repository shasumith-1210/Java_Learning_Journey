/*
 * EXPENSE TRACKER
 *
 * This program stores daily expenses for a week using an array
 * and performs various analyses such as:
 *
 * Displaying all daily expenses
 * Calculating the total expense
 * Calculating the average daily expense
 * Finding the highest and lowest expense
 * Identifying the day with the highest expense
 *
 */

import java.util.Scanner;
public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        double[] expenses = new double[7];

        // Taking expense details as input.
        for (int i = 0; i < expenses.length; i++) {
            System.out.print("Enter expense for " + days[i] + " : ₹");
            expenses[i] = sc.nextDouble();
        }

        double totalExpense = 0;
        double highestExpense = expenses[0];
        double lowestExpense = expenses[0];
        int highestDay = 0;

        // Analyzing expenses.
        for (int i = 0; i < expenses.length; i++) {
            totalExpense += expenses[i];

            if (expenses[i] > highestExpense) {
                highestExpense = expenses[i];
                highestDay = i;
            }

            if (expenses[i] < lowestExpense) {
                lowestExpense = expenses[i];
            }
        }

        double averageExpense = totalExpense / expenses.length;

        // Displaying the expense report.
        System.out.println("\n========== WEEKLY EXPENSE REPORT ==========\n");

        for (int i = 0; i < expenses.length; i++) {
            System.out.println(days[i] + " : ₹" + expenses[i]);
        }

        System.out.printf("%nTotal Expense : ₹%.2f%n", totalExpense);
        System.out.printf("Average Daily Expense : ₹%.2f%n", averageExpense);
        System.out.printf("Highest Expense : ₹%.2f (%s)%n", highestExpense, days[highestDay]);
        System.out.printf("Lowest Expense : ₹%.2f%n", lowestExpense);

        sc.close();
    }
}