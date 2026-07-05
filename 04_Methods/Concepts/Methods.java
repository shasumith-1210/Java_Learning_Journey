/**
 * Program : Methods
 * This program demonstrates the basic method concepts in Java:
 * - Method Header (Declaration)
 * - Method Definition
 * - Method Invocation (Method Call)
 *
 * Note:
 * Java does not support function prototypes like C/C++.
 */

public class Methods {

    // Method Definition

    // Displays a welcome message.
    public static void greet() {   // Method Header (Declaration)
        System.out.println("Welcome to Java Methods!");
    }

    // Displays a separator line.
    public static void printSeparator() {
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        // Method Invocation (Method Call)
        greet();
        printSeparator();
        greet();
    }
}