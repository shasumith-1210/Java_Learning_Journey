public class LoopControlStatements {
    public static void main(String[] args) {
        System.out.println("Break Statement");

        for (int i = 1; i <= 10; i++) {

            if (i == 6)
                break;

            System.out.print(i + " ");
        }

        System.out.println("\n");

        System.out.println("Continue Statement");

        for (int i = 1; i <= 10; i++) {

            if (i == 6)
                continue;

            System.out.print(i + " ");
        }

        System.out.println("\n");

        System.out.println("Nested Loop");

        for (int row = 1; row <= 3; row++) {

            for (int col = 1; col <= 3; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}