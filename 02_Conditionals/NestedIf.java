public class NestedIf {
    public static void main(String[] args) {
        int age = 22;
        boolean hasLicense = true;

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("Eligible to drive");
            } else {
                System.out.println("License required");
            }
        } else {
            System.out.println("Not eligible to drive");
        }
    }
}