/**
 * Program: Call By Value
 * Demonstrates that Java uses call by value.
 */
public class CallByValue {
    // Attempts to change the value of the variable
    public static void changeValue(int number) {
        number = 100;
        System.out.println("Inside Method = " + number);
    }
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Before Method = " + number);
        changeValue(number);
        System.out.println("After Method = " + number);

    }
}