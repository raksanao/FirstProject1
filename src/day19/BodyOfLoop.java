package day19;

import java.util.Scanner;

public class BodyOfLoop {
    public static void main(String[] args) {
        //create 2 int variable called start and end
        //assuming start speed is alway less then end speed
        //create for loop to stumilate slow increase of the speed
        //for example if start 10 end 27
        //10 11 12 13 14 ...27
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ,");



            }
        }
    }