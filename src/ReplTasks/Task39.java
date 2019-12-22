package ReplTasks;

import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {
      /*  Scanner scan = new Scanner(System.in);

        System.out.println("what is your name");
       String name = scan.next();
       int lengthName=name.length();
        if (lengthName < 4) {
            System.out.println("short name");


        } else if (lengthName <=11) {
        System.out.println("Longer name");*/
        // String name = " rukhshona Olimova";

        Scanner scan = new Scanner(System.in);
           int coupons, candies,gumballs;


        System.out.println("Enter number of coupons:");
        coupons = scan.nextInt();
candies=coupons/10;
gumballs=(coupons%10)/3;
        if (coupons > 10) {
            System.out.println("Number of Candies: 1" + candies);
            System.out.println("Number of Gumballs: 1" + gumballs);
        }else if(coupons<10 && coupons>2) {
            System.out.println("Number of Candies: 1" + candies);
            System.out.println("Number of Gumballs: 1" + gumballs);
        }else if(coupons<3){
            System.out.println("Not enough coupons");

        }

    }

}