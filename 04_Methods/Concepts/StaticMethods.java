/**
 * Program: Static Methods
 * Demonstrates how static methods belong to the class.
 * Static Methods belongs to the blueprint (the class). It exists even if you never create a single object of that class.
 * Here the this keyword cannot be used and cannot access instance variables or call non static methods directly.
 */
public class StaticMethods {

    // Displays a welcome message
    public static void greet() {
        System.out.println("Welcome to Static Methods!");
    }

    // Displays today's topic
    public static void showTopic() {
        System.out.println("Today's Topic: Static Methods");
    }

    public static void main(String[] args) {

        greet();

        showTopic();

    }
}