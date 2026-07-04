import java.util.Scanner;
public class PrintEvenOddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Even Numbers : ");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.print("Odd Numbers : ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        
        sc.close();
    }
}
