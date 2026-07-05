/**
 * Program: Geometry Operations
 * Demonstrates various geometric calculations using methods.
 */

import java.util.Scanner;

public class GeometryOperations {

    // Returns the area of a circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // Returns the area of a rectangle
    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    // Returns the area of a triangle
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // Returns the perimeter of a rectangle
    public static double perimeterOfRectangle(double length, double width) {
        return 2 * (length + width);
    }

    // Returns the circumference of a circle
    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.println("\nResults");
        System.out.printf("Area of Circle          : %.2f%n", areaOfCircle(radius));
        System.out.printf("Circumference           : %.2f%n", circumference(radius));
        System.out.printf("Area of Rectangle       : %.2f%n", areaOfRectangle(length, width));
        System.out.printf("Perimeter of Rectangle  : %.2f%n", perimeterOfRectangle(length, width));
        System.out.printf("Area of Triangle        : %.2f%n", areaOfTriangle(base, height));

        sc.close();
    }
}