package day22;

import java.util.Scanner;

public class ScannerLoopArray {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println();
        int []numbers=new int[10];
        for (int i = 0; i <numbers.length; i++) {
            System.out.println("Enter ur number"+(i+1));
            numbers[i]=scan.nextInt();
            System.out.println(numbers[i]);
        }
        for (int x = 0; x <numbers.length ; x++) {
            System.out.println(numbers[x]+" ");
        }

    }
}
