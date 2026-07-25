/*
 * ELECTRICITY BILL ANALYZER
 *
 * This program stores the monthly electricity bills using an
 * array and performs various analyses such as:
 *
 * Displaying all monthly bills
 * Calculating the total and average bill
 * Finding the highest and lowest bill
 * Counting months with bills above the average
 *
 */

import java.util.Scanner;
public class ElectricityBillAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] bills = new double[12];
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        // Taking bill details as input.
        for (int i = 0; i < bills.length; i++) {
            System.out.print("Enter bill for " + months[i] + " : $");
            bills[i] = sc.nextDouble();
        }

        double totalBill = 0;
        double highestBill = bills[0];
        double lowestBill = bills[0];
        int highestMonth = 0;
        int lowestMonth = 0;

        // Analyzing electricity bills.
        for (int i = 0; i < bills.length; i++) {
            totalBill += bills[i];
            if (bills[i] > highestBill) {
                highestBill = bills[i];
                highestMonth = i;
            }
            if (bills[i] < lowestBill) {
                lowestBill = bills[i];
                lowestMonth = i;
            }
        }

        double averageBill = totalBill / bills.length;

        int aboveAverageMonths = 0;

        // Counting months with above average bills.
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] > averageBill) {
                aboveAverageMonths++;
            }
        }

        // Displaying bill report.
        System.out.println("\n========== ELECTRICITY BILL REPORT ==========\n");

        for (int i = 0; i < bills.length; i++) {
            System.out.printf("%-10s : $%.2f%n", months[i], bills[i]);
        }

        System.out.printf("%nTotal Bill : $%.2f%n", totalBill);
        System.out.printf("Average Bill : $%.2f%n", averageBill);
        System.out.printf("Highest Bill : $%.2f (%s)%n", highestBill, months[highestMonth]);
        System.out.printf("Lowest Bill : $%.2f (%s)%n", lowestBill, months[lowestMonth]);
        System.out.println("Months Above Average Bill : " + aboveAverageMonths);

        sc.close();
    }
}