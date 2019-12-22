package day23;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //find length of your name  using the array

        Scanner scan = new Scanner(System.in);
        //DO NOT CHANGE

        //WRITE YOUR CODE HERE

        System.out.println(" Enter your number:");
        int num, digit1, digit2, digit3, digit4, digit5;
         num=scan.nextInt();
         digit5=num%10;
         digit4=(num%100-digit5)/10;
        digit3=(num%1000-digit4-digit5)/100;
        digit2=(num%10000-digit3-digit4-digit5)/1000;
        digit1=(num%100000-digit2-digit3-digit4-digit5)/10000;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);
    }
}



