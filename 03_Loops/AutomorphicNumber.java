import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int square = number * number;

        if (String.valueOf(square).endsWith(String.valueOf(number)))
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");

        sc.close();
    }
}