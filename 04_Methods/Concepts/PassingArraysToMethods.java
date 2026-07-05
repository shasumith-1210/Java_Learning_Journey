/**
 * Program: Passing Arrays to Methods
 * Demonstrates how arrays can be passed as method arguments.
 */
public class PassingArraysToMethods {

    // Prints all the elements of the array
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        printArray(numbers);
    }
}