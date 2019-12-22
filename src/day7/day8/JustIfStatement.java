package day7.day8;

import java.util.Scanner;

public class JustIfStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your current speed");
        int currentSpeed = scan.nextInt();
        System.out.println("What is the speed limit");
        int speedLimit = scan.nextInt();
        if (currentSpeed >= speedLimit) ;
        {
            System.out.println("get pulled over the police");
            System.out.println("given ticket by police");
            System.out.println("taken away some point");


        }

        System.out.println("The end of the story");
    }
}


