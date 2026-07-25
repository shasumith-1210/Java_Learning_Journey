/*
 * INVENTORY MANAGEMENT
 *
 * This program stores the stock quantity of different products
 * using arrays and performs various operations such as:
 *
 * Displaying all products and their stock
 * Searching for a product
 * Updating product stock
 * Identifying low stock products
 *
 */

import java.util.Scanner;
public class InventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] products = {"Pen","Notebook","Pencil","Eraser","Marker"};

        int[] stock = {50, 25, 60, 15, 8};

        // Displaying inventory.
        System.out.println("========== INVENTORY ==========\n");

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - Stock : " + stock[i]);
        }

        // Searching for a product.
        System.out.print("\nEnter product name to search : ");
        String search = sc.next();

        boolean found = false;

        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(search)) {

                System.out.println(products[i] + " is available.");
                System.out.println("Current Stock : " + stock[i]);

                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("Product not found.");
        }

        // Updating stock.
        System.out.print("\nEnter product number to update stock : ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= products.length) {
            System.out.print("Enter new stock : ");
            stock[choice - 1] = sc.nextInt();

            System.out.println("Stock updated successfully.");

        } else {
            System.out.println("Invalid product number.");
        }

        // Displaying low stock products.
        System.out.println("\n========== LOW STOCK PRODUCTS ==========\n");

        boolean lowStockFound = false;

        for (int i = 0; i < stock.length; i++) {
            if (stock[i] < 10) {
                System.out.println(products[i] + " - Stock : " + stock[i]);
                lowStockFound = true;
            }
        }

        if (!lowStockFound) {
            System.out.println("No low stock products.");
        }

        // Displaying updated inventory.
        System.out.println("\n========== UPDATED INVENTORY ==========\n");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " - Stock : " + stock[i]);
        }

        sc.close();

    }
}