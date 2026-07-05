/**
 * Program: Instance Methods
 * Demonstrates how instance methods are called using objects.
 */
public class InstanceMethods {

    // Displays a welcome message
    public void greet() {
        System.out.println("Welcome to Instance Methods!");
    }

    // Displays the current topic
    public void showTopic() {
        System.out.println("Today's Topic: Instance Methods");
    }

    public static void main(String[] args) {
        InstanceMethods object = new InstanceMethods();
        object.greet();
        object.showTopic();
    }
}