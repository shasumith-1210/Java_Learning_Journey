/**
 * Program: Variable Arguments
 * Demonstrates how a method can accept a variable number of arguments.
 * three dots (...) is used to indicate the variable arguments
 * so what happens is that when you call sum(10,20) , The java compiler automatically translates your call into: sum(new int[]{10,20});
 * 
 * Rules:
 * Rule 1: It must be the last parameter
 * If your method takes multiple types of arguments, the vararg parameter must be placed at the very end of the argument list.java
 * VALID : public void setup(int id, String role, double... hours) {}
 * INVALID (Will not compile): public void setup(double... hours, int id, String role) {} 
 * Rule 2: Only one vararg per method
 * You cannot have more than one variable-length argument list in a single method signature.java
 * INVALID (Will not compile): public void logData(String... messages, int... codes) {}
 */
public class VariableArguments {

    // Returns the sum of all the numbers passed to the method
    public static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum = " + sum(10, 20));
        System.out.println("Sum = " + sum(10, 20, 30));
        System.out.println("Sum = " + sum(10, 20, 30, 40));
    }
}