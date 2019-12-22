package day18;

import java.util.Scanner;

public class GiveMe5 {
    public static void main(String[] args) {
        //keep asking for 5 or 20 untill u get it
        Scanner scan=new Scanner(System.in);
        System.out.println("Give me 5 or 20");
        int x =scan.nextInt();
        while(x!=5&&x!=20){
            System.out.println("not what im asking");
            System.out.println("give me five");
            x=scan.nextInt();
        }
        System.out.println("got the money");
    }
}
