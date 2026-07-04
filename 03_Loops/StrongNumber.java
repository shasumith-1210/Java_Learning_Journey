import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int sum = 0;

        while (number != 0) {

            int digit = number % 10;
            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            sum += factorial;
            number /= 10;

        }

        if (original == sum)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");

        sc.close();
    }
}