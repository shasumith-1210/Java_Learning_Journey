/*
 * MOVIE RATING ANALYZER
 *
 * This program stores the ratings of different movies using an
 * array and performs various analyses such as:
 *
 * Displaying all movie ratings
 * Calculating the average rating
 * Finding the highest and lowest rated movie
 * Counting movies with ratings above the average
 *
 */

import java.util.Scanner;
public class MovieRatingAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of movies : ");
        int numberOfMovies = sc.nextInt();

        double[] ratings = new double[numberOfMovies];

        // Taking movie ratings as input.
        for (int i = 0; i < ratings.length; i++) {
            System.out.print("Enter rating for Movie " + (i + 1) + " (0-10) : ");
            ratings[i] = sc.nextDouble();
        }

        double totalRating = 0;
        double highestRating = ratings[0];
        double lowestRating = ratings[0];
        int highestRatedMovie = 0;
        int lowestRatedMovie = 0;

        // Analyzing movie ratings.
        for (int i = 0; i < ratings.length; i++) {
            totalRating += ratings[i];

            if (ratings[i] > highestRating) {
                highestRating = ratings[i];
                highestRatedMovie = i;
            }

            if (ratings[i] < lowestRating) {
                lowestRating = ratings[i];
                lowestRatedMovie = i;
            }
        }

        double averageRating = totalRating / numberOfMovies;
        int aboveAverageMovies = 0;

        // Counting movies with ratings above average.
        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] > averageRating) {
                aboveAverageMovies++;
            }
        }

        // Displaying movie rating report.
        System.out.println("\n========== MOVIE RATING REPORT ==========\n");

        for (int i = 0; i < ratings.length; i++) {
            System.out.printf("Movie %d : %.1f/10%n", (i + 1), ratings[i]);
        }

        System.out.printf("%nAverage Rating : %.2f/10%n", averageRating);
        System.out.printf("Highest Rated Movie : Movie %d (%.1f/10)%n", highestRatedMovie + 1, highestRating);
        System.out.printf("Lowest Rated Movie : Movie %d (%.1f/10)%n", lowestRatedMovie + 1, lowestRating);
        System.out.println("Movies Above Average Rating : " + aboveAverageMovies);

        sc.close();

    }
}