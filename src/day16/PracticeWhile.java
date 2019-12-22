package day16;

import java.util.Scanner;

public class PracticeWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count,number;
        System.out.println("enter number");
       number=scan.nextInt();

        count=0;
        while(count<number) {
            System.out.println(+count+",");
            count+=2;
        }










    }
}
