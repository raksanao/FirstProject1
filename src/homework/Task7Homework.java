package homework;

import java.util.Scanner;

public class Task7Homework {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your email");
        String email=scan.next();
       int atIndex=email.indexOf("@");
       int dotIndex=email.indexOf(".");

        String part=email.substring(0,atIndex);
        System.out.println(part);

        String part1=email.substring(atIndex+1,dotIndex);
        System.out.println(part1);

        String part2=email.substring(dotIndex+1);
        System.out.println(part2);



    }
}
