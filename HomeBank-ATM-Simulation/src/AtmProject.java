/*
 * HomeBank ATM Simulation Project
 * A Java console application demonstrating loop-based state management, user interaction, and account safety checks.
 */

import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int balance = 1000;
        int choice;
        int amount;

        System.out.println("Welcome to HomeBank!");
        System.out.println("Your current balance: " + balance + "$");

        while (true) {
            System.out.println("(1) -------> Deposit Money");
            System.out.println("(2) -------> Withdraw Money");
            System.out.println("(3) -------> Check Balance");
            System.out.println("(4) -------> Exit");
            System.out.print("Select the operation you want to perform: ");

            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter the amount to deposit: ");
                amount = input.nextInt();
                balance += amount;
                System.out.println("Amount successfully deposited. Updated balance: " + balance + "$");
            }
            else if (choice == 2) {
                System.out.print("Enter the amount to withdraw: ");
                amount = input.nextInt();
                if (amount > balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    balance -= amount;
                    System.out.println("Amount withdrawn. Please take your cash.");
                    System.out.println("Updated balance: " + balance + "$");
                }
            }
            else if (choice == 3) {
                System.out.println("Your current balance: " + balance + "$");
            }
            else if (choice == 4) {
                System.out.println("Logging out...");
                break;
            }
            else {
                System.out.println("Invalid command entered! Please try again.");
            }
        }
        System.out.println("Thank you for choosing HomeBank. Have a great day!");
    }
}