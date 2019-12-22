package day5;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //task1
       // System.out.println("What day count?");
       // int dayCount = scan.nextInt();
       // int minute = 1440*dayCount;
       // System.out.println(dayCount+" days count "+minute+" minutes");

       //task2
       // System.out.println("How much you get per hour in your company?");
       // int hourWage = scan.nextInt();
       // System.out.println("How many hours per day you work?");
       // int perDay =scan.nextInt();
       // System.out.println("How many days a week you work?");
        //int day = scan.nextInt();
       // int yearlyHour = 2080*hourWage;
       // System.out.println("Your yearly income is $"+yearlyHour);

      //task 3 Grocery shopping

        System.out.println("What is the price of tomato?");
        float priceTomato = scan.nextFloat();
        System.out.println("How much do you want?");
        int countTomato = scan.nextInt();
        System.out.println("You got "+ countTomato+ " pound of tomato the price is $"+countTomato*priceTomato);

        System.out.println("How much is the potato?");
        float pricePotato = scan.nextFloat();
        System.out.println("How many do u want?");
        int countPotato =scan.nextInt();
        System.out.println("You got " + countPotato+ " pound of potato the price is $"+ countPotato*pricePotato);

        System.out.println("How much is the price for banana?");
        float priceBanana = scan.nextFloat();
        System.out.println("How much do you want banana?");
        int countBanana = scan.nextInt();
        System.out.println("You got "+countBanana+ " banana your price is $"+countBanana*priceBanana);

        float total = countTomato*priceTomato+countPotato*pricePotato+countBanana*priceBanana;
        System.out.println("Your total for today is $"+total+" Thank you for shopping with us. Have a good day!");
    }

}
