/**
 * Program: Number Checker
 * Demonstrates various number checking methods.
 */

import java.util.Scanner;

public class NumberChecker {

    // Returns true if the number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Returns true if the number is prime
    public static boolean isPrime(int number) {

        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0)
                return false;

        }

        return true;
    }

    // Returns true if the number is a palindrome
    public static boolean isPalindrome(int number) {

        int original = number;
        int reverse = 0;

        while (number != 0) {

            reverse = reverse * 10 + number % 10;
            number /= 10;

        }

        return original == reverse;
    }

    // Returns true if the number is an Armstrong number
    public static boolean isArmstrong(int number) {

        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {

            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;

        }

        return original == sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("\nResults");
        System.out.println("Even          : " + isEven(number));
        System.out.println("Prime         : " + isPrime(number));
        System.out.println("Palindrome    : " + isPalindrome(number));
        System.out.println("Armstrong     : " + isArmstrong(number));

        sc.close();
    }
}