import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int number = sc.nextInt();

        String hexadecimal = "";

        char[] hex = {
                '0', '1', '2', '3',
                '4', '5', '6', '7',
                '8', '9', 'A', 'B',
                'C', 'D', 'E', 'F'
        };

        while (number > 0) {

            hexadecimal = hex[number % 16] + hexadecimal;
            number /= 16;

        }

        System.out.println("Hexadecimal = " + hexadecimal);

        sc.close();
    }
}