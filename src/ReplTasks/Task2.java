package ReplTasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double totalBalance = 100.00;
        double currentBalance;

        System.out.println("Choose item:");
        String Item = scan.nextLine();
        if (Item == "Smartphone") {
            currentBalance = totalBalance - 300.00;
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (Item == "Laptop") {
            currentBalance = totalBalance - 400.00;
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (Item == "Charger") {
            currentBalance = totalBalance - 15.00;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (Item == "USB Cable") {
            System.out.println("Thank you for your purchase!");
            currentBalance = totalBalance - 10.00;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (Item == "Headphones") {
            System.out.println("Thank you for your purchase!");
            currentBalance = totalBalance - 30.00;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (Item == "Pants") {
            System.out.println("Thank you for your purchase!");
            currentBalance = totalBalance - 50.00;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (Item == "Hat") {
            System.out.println("Thank you for your purchase!");
            currentBalance = totalBalance - 25.00;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (Item == "Socks") {
            System.out.println("Thank you for your purchase!");
            currentBalance = totalBalance - 5.00;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (Item == "Blanket") {
            System.out.println("Thank you for your purchase!");
            currentBalance = totalBalance - 60.00;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (Item =="Pillow") {
            System.out.println("Thank you for your purchase!");
            currentBalance = totalBalance - 40.00;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else {
            System.out.println("Invalid item!");
        }

        {



        }
    }

}