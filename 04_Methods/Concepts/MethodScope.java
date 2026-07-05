/**
 * Program: Method Scope
 * Demonstrates the scope and lifetime of local variables.
 */
public class MethodScope {

    // Displays a local variable
    public static void display() {
        int localVariable = 100;
        System.out.println("Inside display() = " + localVariable);
    }

    public static void main(String[] args) {
        int mainVariable = 50;
        System.out.println("Inside main() = " + mainVariable);
        display();
        // localVariable cannot be accessed here because
        // it exists only inside display()

    }
}