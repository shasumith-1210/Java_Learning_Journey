import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int number = sc.nextInt();

        String binary = "";

        while (number > 0) {

            binary = (number % 2) + binary;
            number /= 2;

        }

        System.out.println("Binary = " + binary);

        sc.close();
    }
}