/**
 * Program: Unit Converter
 * Demonstrates unit conversion using methods.
 */

import java.util.Scanner;

public class UnitConverter {

    // Converts kilometers to meters
    public static double kilometersToMeters(double kilometers) {
        return kilometers * 1000;
    }

    // Converts meters to kilometers
    public static double metersToKilometers(double meters) {
        return meters / 1000;
    }

    // Converts centimeters to meters
    public static double centimetersToMeters(double centimeters) {
        return centimeters / 100;
    }

    // Converts meters to centimeters
    public static double metersToCentimeters(double meters) {
        return meters * 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometers: ");
        double kilometers = sc.nextDouble();

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();

        System.out.println("\nResults");
        System.out.println("Kilometers to Meters = " + kilometersToMeters(kilometers));
        System.out.println("Meters to Kilometers = " + metersToKilometers(meters));
        System.out.println("Centimeters to Meters = " + centimetersToMeters(250));
        System.out.println("Meters to Centimeters = " + metersToCentimeters(5));

        sc.close();
    }
}