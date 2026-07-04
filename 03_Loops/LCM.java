import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int first = a;
        int second = b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int lcm = (first * second) / a;

        System.out.println("LCM = " + lcm);

        sc.close();
    }
}