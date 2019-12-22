package homework;

import java.util.Scanner;

public class Homewok5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        String word=scan.next();
        if(word.startsWith("Dr")) {
            System.out.println("doctor");
        }else if(word.startsWith("mr")) {
            System.out.println("Merried");
        }else{
            System.out.println("no such a word");
        }
    }
}
