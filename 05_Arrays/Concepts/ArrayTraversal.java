/*
 * Array Traversal in Java
 * Traversal means visiting every element of an array exactly once.
 * The most common way to traverse an array is by using loops.
 *
 * We generally use:
 * 1. for loop
 * 2. while loop
 * 3. Enhanced for loop ( for each loop )
 * 
 * Enhanced FOR loop
 * 
 * The Enhanced For Loop (for-each loop) is used to traverse arrays and collections without using an index.
 * It automatically visits each element one by one.
 *
 * Syntax:
 * for (dataType variable : arrayName) {
 *     // statements
 * }
 *
 * Advantages:
 *  Simple and easy to read.
 *  No need to manage indexes.
 *  Reduces the chances of index-related errors.
 *
 * Limitation:
 *  Cannot access the index of an element.
 *  Cannot modify the array elements directly.
 *
 * Note: Always use array.length instead of hardcoding the size.
 */

public class ArrayTraversal {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        // Linear Traversal (First Element → Last Element)
        System.out.print("Linear Traversal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Reverse Traversal (Last Element → First Element)
        System.out.print("Reverse Traversal: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Traversal using a while loop
        System.out.print("Traversal using while loop: ");
        int i = 0;
        while (i < n) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();

        // Traversal using an enhanced for loop (for-each)
        // Best when you only need to read each element.
        System.out.print("Traversal using for-each loop: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        /*
         * Time Complexity  : O(n)
         * Auxiliary Space : O(1)
         */
    }
}