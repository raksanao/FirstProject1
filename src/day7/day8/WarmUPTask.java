package day7.day8;

import java.util.Scanner;

public class WarmUPTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


         String  item1, item2, item3, report;

                double  price1, price2, price3, totalPrice;

                int  count1, count2, count3;
        System.out.println("Enter Item1, count and its price:");
        item1=scan.next();
        count1=scan.nextInt();
        price1= scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        item2=scan.next();
        count2=scan.nextInt();
        price2= scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        item3=scan.next();
        count3=scan.nextInt();
        price3= scan.nextDouble();


double totalPrice1 =price1*count1;
        double totalPrice2 =price2*count2;
        double totalPrice3 =price3*count3;
totalPrice= totalPrice1+totalPrice2+totalPrice3;

if(count1>0){
    report="Item1: "+item1;
}



    }

    }
