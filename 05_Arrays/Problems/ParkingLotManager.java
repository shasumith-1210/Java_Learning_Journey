/*
 * PARKING LOT MANAGER
 *
 * This program manages the parking slots in a parking lot
 * using an array and performs various operations such as:
 *
 * Displaying the parking status
 * Parking a vehicle
 * Removing a vehicle
 * Counting occupied and available slots
 *
 */

import java.util.Scanner;
public class ParkingLotManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] parkingSlots = new boolean[10];

        // Parking vehicles.
        System.out.print("Enter the number of occupied parking slots : ");
        int occupiedSlots = sc.nextInt();

        for (int i = 0; i < occupiedSlots; i++) {
            System.out.print("Enter parking slot number (1-10) : ");
            int slot = sc.nextInt();

            if (slot >= 1 && slot <= parkingSlots.length) {
                parkingSlots[slot - 1] = true;
            } else {
                System.out.println("Invalid parking slot.");
            }

        }

        // Displaying parking status.
        System.out.println("\n========== PARKING LOT STATUS ==========\n");

        for (int i = 0; i < parkingSlots.length; i++) {
            System.out.println("Slot " + (i + 1) + " : " + (parkingSlots[i] ? "Occupied" : "Available"));
        }

        // Parking a vehicle.
        System.out.print("\nEnter a parking slot to park a vehicle : ");
        int park = sc.nextInt();

        if (park >= 1 && park <= parkingSlots.length) {
            if (!parkingSlots[park - 1]) {
                parkingSlots[park - 1] = true;
                System.out.println("Vehicle parked successfully.");
            } else {
                System.out.println("Parking slot is already occupied.");
            }
        } else {
            System.out.println("Invalid parking slot.");
        }

        // Removing a vehicle.
        System.out.print("\nEnter a parking slot to remove a vehicle : ");
        int remove = sc.nextInt();

        if (remove >= 1 && remove <= parkingSlots.length) {
            if (parkingSlots[remove - 1]) {
                parkingSlots[remove - 1] = false;
                System.out.println("Vehicle removed successfully.");
            } else {
                System.out.println("Parking slot is already empty.");
            }
        } else {
            System.out.println("Invalid parking slot.");
        }

        int occupied = 0;
        int available = 0;

        // Counting occupied and available slots.
        for (boolean slot : parkingSlots) {
            if (slot) {
                occupied++;
            } else {
                available++;
            }
        }

        // Displaying final parking status.
        System.out.println("\n========== FINAL PARKING REPORT ==========\n");
        for (int i = 0; i < parkingSlots.length; i++) {
            System.out.println("Slot " + (i + 1) + " : "
                    + (parkingSlots[i] ? "Occupied" : "Available"));
        }

        System.out.println("\nOccupied Slots : " + occupied);
        System.out.println("Available Slots : " + available);

        sc.close();

    }
}