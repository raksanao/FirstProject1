package ReplTasks;

import java.util.Scanner;

public class Citizen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = 100;
        int currentBalance;
        String item = scan.nextLine();
        if (item.equalsIgnoreCase("Smartphone")) {
            currentBalance = balance - 300;
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equalsIgnoreCase("Laptop")) {
            currentBalance = balance - 400;
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equalsIgnoreCase("Charger")) {
            currentBalance = balance - 15;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:" + currentBalance + "$");
        } else if (item.equalsIgnoreCase("USB cable")) {
            currentBalance = balance - 10;
            System.out.println("Thank you for purchase!");
            System.out.println("Your current balance is:" + currentBalance + "$");
        } else if (item.equalsIgnoreCase("Headphones")) {
            currentBalance = balance - 30;
            System.out.println("Thank you for purchase!");
            System.out.println("Your current balance is:" + currentBalance + "$");
        } else if (item.equalsIgnoreCase("Pants")) {
            currentBalance = balance - 50;
            System.out.println("Thank you for purchase!");
            System.out.println("Your current balance is:" + currentBalance + "$");
        } else if (item.equalsIgnoreCase("Hat")) {
            currentBalance = balance - 25;
            System.out.println("Thank you for purchase!");
            System.out.println("Your current balance is:" + currentBalance + "$");
        } else if (item.equalsIgnoreCase("Socks")) {
            currentBalance = balance - 5;
            System.out.println("Thank you for purchase!");
            System.out.println("Your current balance is:" + currentBalance + "$");
        } else if (item.equalsIgnoreCase("Blanket")) {
            currentBalance = balance - 60;
            System.out.println("Thank you for purchase!");
            System.out.println("Your current balance is:" + currentBalance + "$");
        } else if (item.equalsIgnoreCase("Pillow")) {
            currentBalance = balance - 40;
            System.out.println("Thank you for purchase!");
            System.out.println("Your current balance is:" + currentBalance + "$");
        } else {
            System.out.println("Invalid item!");
        }
    }
}