/**
 *  Program: Return Type Methods
 *  Demonstrates methods that return values to the caller.
 */
public class ReturnTypeMethods  {
    // Prints the square of the number and returns the result
    public static int square(int number) {
        return number * number;
    }
    // Prints the cube of the number and returns the result
    public static int cube(int number) {
        return number * number * number;
    }

    public static void main(String[] args) {

        int square = square(5);
        int cube = cube(4);

        System.out.println("Square = " + square);
        System.out.println("Cube = " + cube);

    }
}
