package day19;

import java.util.Scanner;

public class PracticeLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter starting speed and ending speed ");
        int start = scan.nextInt();  // 15 ;
        int end = scan.nextInt();  // 29 ;


        if (start < end) {
            System.out.println("INCREASING THE SPEED ");
            // i will increase the speed till i reach ending speed
            for (int i = start; i <= end; i++) {
                System.out.print(i + ",");
            }
        } else if (start > end) {
            System.out.println("DECREASING THE SPEED ");
            // i will decrease the speed till i reach ending speed
            for (int x = start; x >= end; x--) {
                System.out.print(x + ",");
            }

        } else {
            System.out.println("NO ACTION NEEDED!!! SAME SPEED!!!!");


            System.out.println("Starting speed");
            int start1 = scan.nextInt();
            int end2 = scan.nextInt();
            if (start1 < end2) {
                System.out.println("increase speed");
                for (int i = start1; i <= end2; i++) {
                    System.out.println(i);
                }
            } else if (start1 > end2) {
                System.out.println("decreese speed");
                for (int x = start1; x >= end2; x--) {
                    System.out.println(x);
                }
            } else {
                System.out.println("same speed");

            }

        }
    }


}