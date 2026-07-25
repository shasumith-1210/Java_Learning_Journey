/*
 * BANK ACCOUNT MANAGER
 *
 * This program stores the account balances of customers
 * using an array and performs various operations such as:
 *
 * Displaying all account balances
 * Depositing money into an account
 * Withdrawing money from an account
 * Finding the account with the highest balance
 *
 */

import java.util.Scanner;
public class BankAccountManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] balances = {2500, 5200, 1800, 7600, 4300};

        // Displaying account balances.
        System.out.println("========== BANK ACCOUNTS ==========\n");

        for (int i = 0; i < balances.length; i++) {
            System.out.printf("Account %d : $%.2f%n", i + 1, balances[i]);
        }

        // Depositing money.
        System.out.print("\nEnter account number to deposit money : ");
        int account = sc.nextInt();

        if (account >= 1 && account <= balances.length) {
            System.out.print("Enter deposit amount : $");
            double amount = sc.nextDouble();

            balances[account - 1] += amount;

            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid account number.");
        }

        // Withdrawing money.
        System.out.print("\nEnter account number to withdraw money : ");
        account = sc.nextInt();

        if (account >= 1 && account <= balances.length) {
            System.out.print("Enter withdrawal amount : $");
            double amount = sc.nextDouble();

            if (amount <= balances[account - 1]) {
                balances[account - 1] -= amount;
                System.out.println("Amount withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid account number.");
        }

        double highestBalance = balances[0];
        int richestAccount = 0;

        // Finding the account with the highest balance.
        for (int i = 1; i < balances.length; i++) {
            if (balances[i] > highestBalance) {
                highestBalance = balances[i];
                richestAccount = i;
            }
        }

        // Displaying updated account balances.
        System.out.println("\n========== UPDATED ACCOUNT DETAILS ==========\n");

        for (int i = 0; i < balances.length; i++) {
            System.out.printf("Account %d : $%.2f%n", i + 1, balances[i]);
        }

        System.out.printf("%nHighest Balance : $%.2f (Account %d)%n", highestBalance, richestAccount + 1);

        sc.close();
    }
}