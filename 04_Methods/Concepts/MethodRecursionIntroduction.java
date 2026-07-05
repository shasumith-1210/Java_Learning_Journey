/**
 * Program: Recursion Introduction
 * Demonstrates the basic idea of recursion using methods.
 */
public class MethodRecursionIntroduction {

    // Prints numbers from n to 1 recursively
    public static void printNumbers(int number) {
        if (number == 0) {
            return;
        }
        System.out.println(number);
        printNumbers(number - 1);
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}