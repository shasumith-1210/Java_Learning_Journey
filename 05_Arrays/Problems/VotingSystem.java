/*
 * VOTING SYSTEM
 *
 * This program stores the votes received by different candidates
 * using arrays and performs various operations such as:
 *
 * Displaying all candidates and their votes
 * Calculating the total number of votes
 * Finding the winning candidate
 * Calculating the vote percentage of each candidate
 *
 */

import java.util.Scanner;
public class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] candidates = {
                "Alice",
                "Bob",
                "Charlie",
                "David"
        };
        int[] votes = new int[candidates.length];

        // Taking votes as input.
        for (int i = 0; i < votes.length; i++) {
            System.out.print("Enter votes received by " + candidates[i] + " : ");
            votes[i] = sc.nextInt();
        }

        int totalVotes = 0;
        int highestVotes = votes[0];
        int winner = 0;

        // Analyzing votes.
        for (int i = 0; i < votes.length; i++) {
            totalVotes += votes[i];
            if (votes[i] > highestVotes) {
                highestVotes = votes[i];
                winner = i;
            }
        }

        // Displaying election results.
        System.out.println("\n========== ELECTION RESULTS ==========\n");
        for (int i = 0; i < candidates.length; i++) {
            double percentage = (double) votes[i] / totalVotes * 100;
            System.out.printf("%s : %d votes (%.2f%%)%n", candidates[i], votes[i], percentage);
        }

        System.out.println("\nTotal Votes : " + totalVotes);
        System.out.println("Winner : " + candidates[winner]);
        System.out.println("Winning Votes : " + highestVotes);

        sc.close();
    }
}