/*
 * COMMON MISTAKES WITH ARRAYS
 * This program demonstrates some common mistakes beginners
 * make while working with arrays in Java.
 *
 * Uncomment the marked lines one at a time to observe the
 * exceptions or incorrect behavior.
 */

import java.util.Arrays;
public class CommonMistakes {
    public static void main(String[] args) {
        // Mistake 1 : Accessing an invalid index (ArrayIndexOutOfBoundsException)
        int[] numbers = {10, 20, 30, 40, 50};
        // System.out.println(numbers[5]);

        // Mistake 2 : Using <= instead of < while traversing an array.
        // for (int i = 0; i <= numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }

        // Mistake 3 : Assuming arrays are dynamically resizable.
        int[] fixedArray = new int[3];
        System.out.println("Array Size : " + fixedArray.length);

        // Mistake 4 : Comparing arrays using == instead of Arrays.equals().
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println("Using == : " + (array1 == array2));
        System.out.println("Using Arrays.equals() : " + Arrays.equals(array1, array2));

        // Mistake 5 : Confusing length with length().
        System.out.println("Length : " + numbers.length);
        // System.out.println(numbers.length());

        // Mistake 6 : Forgetting default values after array creation.
        int[] marks = new int[5];
        System.out.println("Default Values : " + Arrays.toString(marks));

        // Mistake 7 : NullPointerException with arrays.
        int[] data = null;
        // System.out.println(data.length);

        // Mistake 8 : Forgetting that modifying an array inside a method also modifies the original array.
        changeFirstElement(numbers);
        System.out.println("After Method Call : " + Arrays.toString(numbers));
 
        // Mistake 9 : Assuming every row in a 2D array has the same length.
        int[][] jaggedArray = {
                {1, 2},
                {3, 4, 5},
                {6}
        };
        System.out.println("Jagged Array : " + Arrays.deepToString(jaggedArray));

        // Mistake 10 : Forgetting to sort before binarySearch().
        int[] values = {40, 10, 50, 20, 30};
        int index = Arrays.binarySearch(values, 20);
        System.out.println("Binary Search Without Sorting : " + index);
        Arrays.sort(values);
        index = Arrays.binarySearch(values, 20);
        System.out.println("Binary Search After Sorting : " + index);
    }

    public static void changeFirstElement(int[] array) {
        array[0] = 999;
    }
}