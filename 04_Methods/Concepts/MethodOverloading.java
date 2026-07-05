/**
 * Program: Method Overloading
 * Demonstrates method overloading using different parameter lists.
 */
public class MethodOverloading {
    // Adds two integers
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    // Adds three integers
    public static int add(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }
    // Adds two decimal numbers
    public static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
    public static void main(String[] args) {
        System.out.println("Sum = " + add(10, 20));
        System.out.println("Sum = " + add(10, 20, 30));
        System.out.println("Sum = " + add(10.5, 20.8));
    }
}