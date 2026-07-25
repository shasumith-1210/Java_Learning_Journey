/*
 * java.util.Arrays Utility Class
 *
 * The Arrays class provides several utility methods to perform
 * common operations on arrays such as sorting, searching,
 * copying, comparing, filling, and converting arrays into
 * readable strings.
 *1
 */

import java.util.Arrays;
public class ArraysUtilityClass {
    public static void main(String[] args) {
        int[] numbers = {50, 10, 30, 20, 40};

        // Arrays.toString() : Converts an array into a readable String representation.
        System.out.println("Original Array : " + Arrays.toString(numbers));

        // Arrays.sort() : Sorts the array in ascending order.
        Arrays.sort(numbers);
        System.out.println("Sorted Array : " + Arrays.toString(numbers));

        // Arrays.binarySearch() : Searches for an element in a sorted array and returns its index.
        int index = Arrays.binarySearch(numbers, 30);
        System.out.println("30 found at index : " + index);

        // Arrays.copyOf() : Creates a copy of the specified array.
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array : " + Arrays.toString(copy));

        // Arrays.copyOfRange() : Copies a specified range of elements from an array.
        int[] range = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Copied Range : " + Arrays.toString(range));

        // Arrays.fill() : Fills every element of the array with the specified value.
        int[] filled = new int[5];
        Arrays.fill(filled, 100);
        System.out.println("Filled Array : " + Arrays.toString(filled));

        // Arrays.equals() : Checks whether two arrays contain the same elements.
        System.out.println("Arrays Equal : " + Arrays.equals(numbers, copy));

        // Arrays.compare() : Compares two arrays lexicographically.
        System.out.println("Compare Result : " + Arrays.compare(numbers, copy));

        // Arrays.compareUnsigned() : Compares two arrays treating integer values as unsigned.
        System.out.println("Unsigned Compare : " + Arrays.compareUnsigned(numbers, copy));

        // Arrays.mismatch() : Returns the index of the first mismatched element.
        copy[2] = 99;
        System.out.println("Mismatch Index : " + Arrays.mismatch(numbers, copy));

        // Arrays.hashCode() : Returns the hash code of a one-dimensional array.
        System.out.println("Hash Code : " + Arrays.hashCode(numbers));

        // Arrays.deepToString() : Converts a multidimensional array into a readable String.
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        System.out.println("2D Array : " + Arrays.deepToString(matrix));

        // Arrays.deepEquals() : Compares two multidimensional arrays for equality.
        int[][] matrix2 = {
                {1, 2},
                {3, 4}
        };
        System.out.println("2D Arrays Equal : " + Arrays.deepEquals(matrix, matrix2));

        // Arrays.deepHashCode() : Returns the hash code of a multidimensional array.
        System.out.println("Deep Hash Code : " + Arrays.deepHashCode(matrix));

        // Arrays.parallelSort() : Sorts the array using parallel processing.
        int[] parallelArray = {9, 3, 6, 1, 7};
        Arrays.parallelSort(parallelArray);
        System.out.println("Parallel Sorted : " + Arrays.toString(parallelArray));

        // Arrays.setAll() : Assigns values using the given generator function.
        int[] squares = new int[5];
        Arrays.setAll(squares, i -> i * i);
        System.out.println("Set All : " + Arrays.toString(squares));

        // Arrays.parallelSetAll() : Assigns values in parallel using the given generator function.
        int[] cubes = new int[5];
        Arrays.parallelSetAll(cubes, i -> i * i * i);
        System.out.println("Parallel Set All : " + Arrays.toString(cubes));

        // Arrays.parallelPrefix() : Performs cumulative computation on array elements.
        int[] prefix = {1, 2, 3, 4, 5};
        Arrays.parallelPrefix(prefix, Integer::sum);
        System.out.println("Parallel Prefix : " + Arrays.toString(prefix));

        // Arrays.stream() : Creates a stream from an array.
        System.out.print("Stream Elements : ");
        Arrays.stream(numbers).forEach(num -> System.out.print(num + " "));
        System.out.println();

        // Arrays.asList() : Converts an array into a fixed-size List.
        String[] fruits = {"Apple", "Banana", "Mango"};
        System.out.println("As List : " + Arrays.asList(fruits));
    }
}