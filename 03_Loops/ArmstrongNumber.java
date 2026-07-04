import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {

            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;

        }

        if (original == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");

        sc.close();
    }
}