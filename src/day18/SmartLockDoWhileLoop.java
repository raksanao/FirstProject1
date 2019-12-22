package day18;

import java.util.Scanner;

public class SmartLockDoWhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("knok");
        String password;
        do {
            System.out.println("What is the password");
            password = scan.next();
        }while(!password.equals("B15"));
        System.out.println("door is open");
        }
    }

