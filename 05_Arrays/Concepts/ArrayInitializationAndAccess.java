/*
 * ARRAY INITIALIZATION & ACCESSING ELEMENTS
 *
 * Initialization: Initialization is the process of assigning values to an array.
 *
 * There are two ways to initialize an array:
 *
 * 1. During Creation
 *    int[] numbers = {10, 20, 30, 40, 50};
 *
 * 2. After Creation
 *    int[] numbers = new int[5];
 *    numbers[0] = 10;
 *    numbers[1] = 20;
 *    ...
 *
 * Accessing Elements: Each element is accessed using its index.
 * Syntax: arrayName[index]
 *
 * Note: Index always starts from 0.
 */

import java.util.Arrays;
public class ArrayInitializationAndAccess {
    public static void main(String[] args) {
        // Initialization during creation
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Original Array : " + Arrays.toString(numbers));

        // Accessing elements
        System.out.println("\nFirst Element  : " + numbers[0]);
        System.out.println("Third Element  : " + numbers[2]);
        System.out.println("Last Element   : " + numbers[numbers.length - 1]);

        // Modifying an element
        numbers[1] = 100;

        System.out.println("\nAfter Modification:");
        System.out.println(Arrays.toString(numbers));

        // Initialization after creation
        int[] marks = new int[5];

        marks[0] = 85;
        marks[1] = 92;
        marks[2] = 78;
        marks[3] = 88;
        marks[4] = 95;

        System.out.println("\nMarks Array : " + Arrays.toString(marks));
    }
}