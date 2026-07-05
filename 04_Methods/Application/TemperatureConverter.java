/**
 * Program: Temperature Converter
 * Demonstrates temperature conversion using methods.
 */

import java.util.Scanner;

public class TemperatureConverter {

    // Converts Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Converts Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        System.out.printf("Celsius to Fahrenheit : %.2f%n", celsiusToFahrenheit(celsius));
        System.out.printf("Fahrenheit to Celsius : %.2f%n", fahrenheitToCelsius(fahrenheit));

        sc.close();
    }
}