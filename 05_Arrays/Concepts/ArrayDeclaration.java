/*
 * ARRAY DECLARATION & CREATION
 *
 * Declaration:
 * Declaring an array tells Java what type of elements the array
 * will store.
 *
 * Syntax: dataType[] arrayName;
 * Example: int[] numbers;
 *
 *
 * Creation:
 * An array is created using the 'new' keyword.
 *
 * Syntax: arrayName = new dataType[size];
 * Example:  numbers = new int[5];
 *
 * Declaration + Creation Together: int[] numbers = new int[5];
 */

import java.util.Arrays;

public class ArrayDeclaration {

    public static void main(String[] args) {

        // Declaration + Creation
        int[] numbers = new int[5];

        // Different Types of Arrays
        double[] prices = new double[3];
        char[] grades = new char[4];
        boolean[] status = new boolean[2];
        String[] names = new String[3];

        System.out.println("Integer Array : " + Arrays.toString(numbers));
        System.out.println("Double Array  : " + Arrays.toString(prices));
        System.out.println("Character Array : " + Arrays.toString(grades));
        System.out.println("Boolean Array : " + Arrays.toString(status));
        System.out.println("String Array  : " + Arrays.toString(names));
    }
}