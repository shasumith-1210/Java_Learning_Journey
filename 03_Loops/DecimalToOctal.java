import java.util.Scanner;

public class DecimalToOctal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int number = sc.nextInt();

        String octal = "";

        while (number > 0) {

            octal = (number % 8) + octal;
            number /= 8;

        }

        System.out.println("Octal = " + octal);

        sc.close();
    }
}