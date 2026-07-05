/**
 * Program: Number Operations
 * Demonstrates various mathematical operations using methods.
 */

import java.util.Scanner;

public class NumberOperations {

    // Returns the factorial of a number
    public static long factorial(int number) {

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    // Returns the reverse of a number
    public static int reverseNumber(int number) {

        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        return reverse;
    }

    // Returns the sum of digits
    public static int sumOfDigits(int number) {

        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    // Returns the number of digits
    public static int countDigits(int number) {

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number != 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    // Returns base raised to the given exponent
    public static int power(int base, int exponent) {

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        System.out.println("\nResults");
        System.out.println("Factorial      : " + factorial(number));
        System.out.println("Reverse Number : " + reverseNumber(number));
        System.out.println("Sum of Digits  : " + sumOfDigits(number));
        System.out.println("Digit Count    : " + countDigits(number));
        System.out.println("Power          : " + power(number, exponent));

        sc.close();
    }
}