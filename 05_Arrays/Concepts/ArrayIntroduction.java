/*
 * ARRAYS IN JAVA
 *
 * Definition:
 * An array is a collection of elements of the same data type
 * stored in contiguous memory locations.
 *
 * Each element is accessed using its index, where indexing
 * starts from 0.
 *
 * Why Do We Need Arrays?
 * Instead of creating multiple variables to store similar data,
 * an array allows us to store all values under a single name.
 *
 * Example:
 *
 * Without Arrays:
 * int mark1 = 85 , mark2 = 90 , mark3 = 78 , mark4 = 88 , mark5 = 95;
 *
 * With Arrays:
 * int[] marks = {85, 90, 78, 88, 95};
 *
 * Advantages:
 *  Stores multiple values using a single variable.
 *  Easy to traverse using loops.
 *  Provides fast access using indexes.
 *  Forms the foundation for many data structures.
 *
 * Limitations:
 *  Fixed size after creation.
 *  Can store only one type of data.
 *  Insertion and deletion are expensive.
 *
 * Important Points:
 * • Arrays are objects in Java.
 * • Indexing always starts from 0.
 * • Array size cannot be changed after creation.
 * • Every array has a 'length' property. (arrayname.length -> since array size is fixed property it isnt a function)
 */

public class ArrayIntroduction {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First Element  : " + numbers[0]);
        System.out.println("Third Element  : " + numbers[2]);
        System.out.println("Last Element   : " + numbers[numbers.length - 1]);

        System.out.println("\nArray Size : " + numbers.length);
    }
}