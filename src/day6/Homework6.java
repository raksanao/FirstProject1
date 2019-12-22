package day6;
import java.util.Scanner;
public class Homework6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double regularPrice;
        double salesPrice;
        double discountPrice;
        System.out.println(" What is regular price for this item? ");
         regularPrice = scan.nextDouble();
        System.out.println("What is sales price for this item? ");
        salesPrice = scan.nextDouble();
        System.out.println("What is discount price for this item? ");
        discountPrice = scan.nextDouble();

        salesPrice= regularPrice-regularPrice*discountPrice;
        System.out.println(" Regular price is "+regularPrice+ "After discount you get "+ discountPrice+ "An you got deal for"+ salesPrice);

    }
}
