/*
 * CRICKET SCORE ANALYZER
 *
 * This program stores the runs scored in each over of a cricket
 * match using an array and performs various analyses such as:
 *
 * Displaying runs scored in each over
 * Calculating the total score
 * Calculating the average runs per over
 * Finding the highest and lowest scoring over
 * Counting the number of dot overs
 *
 */

import java.util.Scanner;
public class CricketScoreAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of overs : ");
        int numberOfOvers = sc.nextInt();

        int[] runs = new int[numberOfOvers];

        // Taking runs as input.
        for (int i = 0; i < runs.length; i++) {
            System.out.print("Enter runs scored in Over " + (i + 1) + " : ");
            runs[i] = sc.nextInt();
        }

        int totalRuns = 0;
        int highestRuns = runs[0];
        int lowestRuns = runs[0];
        int bestOver = 0;
        int worstOver = 0;
        int dotOvers = 0;

        // Analyzing runs.
        for (int i = 0; i < runs.length; i++) {
            totalRuns += runs[i];
            if (runs[i] > highestRuns) {
                highestRuns = runs[i];
                bestOver = i;
            }

            if (runs[i] < lowestRuns) {
                lowestRuns = runs[i];
                worstOver = i;
            }

            if (runs[i] == 0) {
                dotOvers++;
            }
        }

        double averageRuns = (double) totalRuns / numberOfOvers;

        // Displaying score report.
        System.out.println("\n========== MATCH SCORE REPORT ==========\n");

        for (int i = 0; i < runs.length; i++) {
            System.out.println("Over " + (i + 1) + " : " + runs[i] + " Runs");
        }

        System.out.println("\nTotal Score : " + totalRuns);
        System.out.printf("Average Runs Per Over : %.2f%n", averageRuns);
        System.out.println("Highest Scoring Over : Over " + (bestOver + 1) + " (" + highestRuns + " Runs)");
        System.out.println("Lowest Scoring Over : Over " + (worstOver + 1) + " (" + lowestRuns + " Runs)");
        System.out.println("Dot Overs : " + dotOvers);

        sc.close();

    }
}