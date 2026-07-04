import java.util.Scanner;

public class HexadecimalToDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hexadecimal number: ");
        String hexadecimal = sc.nextLine().toUpperCase();

        int decimal = 0;

        for (int i = 0; i < hexadecimal.length(); i++) {

            char ch = hexadecimal.charAt(i);

            if (ch >= '0' && ch <= '9')
                decimal = decimal * 16 + (ch - '0');
            else
                decimal = decimal * 16 + (ch - 'A' + 10);

        }

        System.out.println("Decimal = " + decimal);

        sc.close();
    }
}