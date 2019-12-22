package day2;

import java.util.Scanner;

public class Ifstatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //please put your last name
        //System.out.println("Please put your  name");
        //String name=scan.next();
        //System.out.println("Your name is "+name);
        //String lastName=scan.next();
        //System.out.println("enter last name");
        //System.out.println("your are "+name+lastName);

        //int currentSpeed =45;
        // int mySpeed;
        //System.out.println("What is you speed");
        //mySpeed=scan.nextInt();
        //System.out.println("Your speed is"+mySpeed);
        // int total= mySpeed-currentSpeed;
        // System.out.println("you speed more then "+total );
        //System.out.println("what is ur hour wage");
        //int hour;
        //         hour=scan.nextInt();
        //
        //System.out.println(hour*2080);


        String myAnswer = " ";
        int myNumber = 90;
        if (myNumber % 5 == 0) {
            myAnswer = "FizNumber";
        } else {
            myAnswer = "Not Fizz NUmber";}

            System.out.println("Print my name is " + myNumber + "it is " + myAnswer);


        }
    }
