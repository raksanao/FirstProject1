package homework;

import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();


        for (int day = 0; day <= inhabitants; day++) {
            inhabitants = inhabitants / 2;
            System.out.println("Day  " + day + " " + "[" + inhabitants + "]");
            System.out.println("---- EXTINCT ----");
        }


    }
}