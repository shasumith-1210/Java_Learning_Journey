public class TernaryOperator {
    public static void main(String[] args) {
        int number = 25;

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);

        int a = 15;
        int b = 20;

        int max = (a > b) ? a : b;

        System.out.println("Largest = " + max);
    }
}