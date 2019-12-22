package homework;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        //String first = "A";
        //char firstChar = first.charAt(0);

        // String second = "Z";
        // char secondChar = second.charAt(0);
        // for (char iChar = firstChar; iChar <= secondChar; iChar++) {
        //    System.out.print(iChar + "");

        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);
       // String second = scan.next();


        //String firstL =scan.next();
        //  char firstChar = firstL.charAt(0);

        //  String secondL = "Z";
        //char  = second.charAt(0);
        for (char i = start; i <= end; i++) {
            System.out.print(i + ",");


        }

    }
}


