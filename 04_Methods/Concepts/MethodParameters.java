/**
 * Program: MethodParameters
 * Demonstrates how values can be passed to methods using parameters.
 */

public class MethodParameters {
    // Greets the user.
    // @param name Name of the user
    public static void greet(String name) {
        System.out.println("Welcome " + name + "!");
    }

    //  Prints the square of a number.
    //  @param number Input number
    public static void printSquare(int number) {
        System.out.println("Square = " + (number * number));
    }

    public static void main(String[] args) {
        greet("John");
        printSquare(8);
    }
}
