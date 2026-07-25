/*
 * LIBRARY BOOK TRACKER
 *
 * This program stores the availability of books in a library
 * using arrays and performs various operations such as:
 *
 * Displaying all books
 * Searching for a book
 * Issuing a book
 * Returning a book
 * Displaying available books
 *
 */

import java.util.Scanner;
public class LibraryBookTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {"Java Programming","Python Basics","Data Structures","Operating Systems","Database Management"};

        boolean[] available = {true,true,false,true,false };

        // Displaying all books.
        System.out.println("========== LIBRARY BOOKS ==========\n");

        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i] + " - " +
                    (available[i] ? "Available" : "Issued"));
        }

        // Searching for a book.
        System.out.print("\nEnter book name to search : ");
        sc.nextLine();
        String search = sc.nextLine();

        int index = -1;

        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(search)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Book not found.");
        } else {
            System.out.println("Book Found : " + books[index]);
            System.out.println("Status : " +
                    (available[index] ? "Available" : "Issued"));
        }

        // Issuing a book.
        System.out.print("\nEnter book number to issue : ");
        int issue = sc.nextInt();

        if (issue >= 1 && issue <= books.length) {
            if (available[issue - 1]) {
                available[issue - 1] = false;
                System.out.println("Book issued successfully.");
            } else {
                System.out.println("Book is already issued.");
            }
        } else {
            System.out.println("Invalid book number.");
        }

        // Returning a book.
        System.out.print("\nEnter book number to return : ");
        int returned = sc.nextInt();

        if (returned >= 1 && returned <= books.length) {
            if (!available[returned - 1]) {
                available[returned - 1] = true;
                System.out.println("Book returned successfully.");
            } else {
                System.out.println("Book is already available.");
            }
        } else {
            System.out.println("Invalid book number.");
        }

        // Displaying available books.
        System.out.println("\n========== AVAILABLE BOOKS ==========\n");

        boolean bookAvailable = false;

        for (int i = 0; i < books.length; i++) {
            if (available[i]) {
                System.out.println(books[i]);
                bookAvailable = true;
            }
        }

        if (!bookAvailable) {
            System.out.println("No books are currently available.");
        }
        sc.close();
    }
}