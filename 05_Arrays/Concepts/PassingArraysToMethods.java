/*
 * PASSING ARRAYS TO METHODS
 *
 * Arrays can be passed to methods just like any other variable.
 * Since arrays are objects in Java, the reference to the array is passed to the method, not a copy of the entire array.
 * Therefore, any modifications made inside the method will affect the original array.
 */

import java.util.Arrays;
public class PassingArraysToMethods {
    // Display the array
    public static void displayArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    // Double each element of the array
    public static void doubleElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Original Array : ");
        displayArray(numbers);

        doubleElements(numbers);
        System.out.print("Modified Array : ");
        displayArray(numbers);
    }
}