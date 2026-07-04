public class LargestOfThree {
    public static void main(String[] args) {
        int a = 15;
        int b = 45;
        int c = 32;

        if (a >= b && a >= c) {
            System.out.println(a + " is largest");
        } else if (b >= c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }
    }
}