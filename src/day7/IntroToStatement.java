package day7;

import java.util.Scanner;

public class IntroToStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name last name and the company");
        String firstName,lastName,company,email;
        firstName = scan.next();
        lastName= scan.next();
        company = scan.next();
        email = firstName +lastName+company+"@.com";
        System.out.println(firstName+" "+lastName+ " "+company+" "+email);


    }
}
