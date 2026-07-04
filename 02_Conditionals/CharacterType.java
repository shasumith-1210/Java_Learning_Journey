import java.util.Scanner;
public class CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch))
            System.out.println("Uppercase Letter");
        else if (Character.isLowerCase(ch))
            System.out.println("Lowercase Letter");
        else if (Character.isDigit(ch))
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
}