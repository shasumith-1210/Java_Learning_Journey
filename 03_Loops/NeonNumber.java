import java.util.Scanner;

public class NeonNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int square = number * number;
        int sum = 0;

        while (square != 0) {

            sum += square % 10;
            square /= 10;

        }

        if (sum == number)
            System.out.println("Neon Number");
        else
            System.out.println("Not a Neon Number");

        sc.close();
    }
}