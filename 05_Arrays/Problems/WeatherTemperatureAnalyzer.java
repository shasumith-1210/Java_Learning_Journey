/*
 * WEATHER TEMPERATURE ANALYZER
 *
 * This program stores the temperature of seven days using an array
 * and performs various analyses such as:
 *
 * Displaying the temperature of each day
 * Calculating the average temperature
 * Finding the highest and lowest temperature
 * Identifying the hottest and coldest day
 *
 */

import java.util.Scanner;
public class WeatherTemperatureAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        double[] temperature = new double[7];

        // Taking temperature as input.
        for (int i = 0; i < temperature.length; i++) {
            System.out.print("Enter temperature for " + days[i] + " (°C) : ");
            temperature[i] = sc.nextDouble();
        }

        double totalTemperature = 0;
        double highestTemperature = temperature[0];
        double lowestTemperature = temperature[0];
        int hottestDay = 0;
        int coldestDay = 0;

        // Analyzing temperatures.
        for (int i = 0; i < temperature.length; i++) {
            totalTemperature += temperature[i];

            if (temperature[i] > highestTemperature) {
                highestTemperature = temperature[i];
                hottestDay = i;
            }

            if (temperature[i] < lowestTemperature) {
                lowestTemperature = temperature[i];
                coldestDay = i;
            }

        }

        double averageTemperature = totalTemperature / temperature.length;

        // Displaying the weather report.
        System.out.println("\n========== WEEKLY WEATHER REPORT ==========\n");

        for (int i = 0; i < temperature.length; i++) {
            System.out.println(days[i] + " : " + temperature[i] + "°C");
        }

        System.out.printf("%nAverage Temperature : %.2f°C%n", averageTemperature);
        System.out.printf("Highest Temperature : %.2f°C (%s)%n", highestTemperature, days[hottestDay]);
        System.out.printf("Lowest Temperature : %.2f°C (%s)%n", lowestTemperature, days[coldestDay]);

        sc.close();
    }
}