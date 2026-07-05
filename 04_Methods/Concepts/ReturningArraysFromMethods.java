/**
 * Program: Returning Arrays from Methods
 * Demonstrates how methods can return arrays.
 */
public class ReturningArraysFromMethods {

    // Creates and returns an array
    public static int[] createArray() {
        int[] numbers = {10, 20, 30, 40, 50};
        return numbers;
    }

    public static void main(String[] args) {
        int[] array = createArray();
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}