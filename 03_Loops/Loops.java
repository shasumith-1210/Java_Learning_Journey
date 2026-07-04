public class Loops {
    public static void main(String[] args) {
        System.out.println("For Loop");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        System.out.println("While Loop");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n");

        System.out.println("Do While Loop");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 5);
    }
}