import java.util.Scanner;

public class SumAndProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0,product = 1;

        while (number != 0) {
            sum += number % 10;
            product *= number % 10;
            number /= 10;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        
        sc.close();
    }
}