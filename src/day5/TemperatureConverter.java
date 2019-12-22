package day5;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
       // System.out.println("What is the temperature in F?");
       // Scanner scan;
       // double fernheight = sun.nextDouble();
       // double celsius = (5.0/9)* (fernheight-32);
       // System.out.println("ferenheit "+ fernheight+ " is "+ celsius+ " in class");


        System.out.println("How many minutes has a day");
        int day = scan.nextInt();
        int minute = day * 1440;
        System.out.println(day+" day has "+minute +" minutes ");



        System.out.println("How much you get a day ?");
        int hourly = scan.nextInt();
        int yearlySalery = hourly*200;
        System.out.println(" Yor weekly wage is "+ yearlySalery);



        //task3: Grocery shopping

        System.out.println("How much is the tomato");
        float priceTomato = scan.nextFloat();
        System.out.println("How many pound do you want?");
        int poundTomato = scan.nextInt();
        float totalTomato = priceTomato*poundTomato ;
        System.out.println(" Your total is "+totalTomato+ "$");



        System.out.println(" How much is potato per pound?");
        float pricePotato =scan.nextFloat();
        System.out.println("How many pound of potato you want to buy");
        int poundPotato =scan.nextInt();
        float totalPotato = poundPotato * pricePotato ;
        System.out.println("Your total is "+ "$"+totalPotato);


        System.out.println(" How much is banana?");
        float priceBanana = scan.nextFloat();
        System.out.println("How many you want?");
        int pieceBanana =scan.nextInt();
        double totalBanana = priceBanana*pieceBanana;
        System.out.println("Your grand total for this shopping is "+"$"+totalBanana+totalPotato+totalTomato);
    }

}
