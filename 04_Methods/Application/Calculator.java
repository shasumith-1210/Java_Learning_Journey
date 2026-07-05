/**
 * Program: Calculator Using Methods
 * Demonstrates the use of multiple methods to perform arithmetic operations.
 */

import java.util.Scanner;

public class Calculator {

    // Returns the sum of two numbers
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // Returns the difference of two numbers
    public static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    // Returns the product of two numbers
    public static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    // Returns the quotient of two numbers
    public static double divide(int dividend, int divisor) {

        if (divisor == 0) {
            return 0;
        }

        return (double) dividend / divisor;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("Addition = " + add(firstNumber, secondNumber));
        System.out.println("Subtraction = " + subtract(firstNumber, secondNumber));
        System.out.println("Multiplication = " + multiply(firstNumber, secondNumber));
        System.out.println("Division = " + divide(firstNumber, secondNumber));

        sc.close();
    }
}